package com.github.dcrissman.pom_generator;

import java.io.IOException;
import java.util.List;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Writer;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import com.github.dcrissman.pom_generator.model.DependencyModel;
import com.github.dcrissman.pom_generator.model.OrganizationModel;

@Mojo(name="generate", defaultPhase = LifecyclePhase.PACKAGE)
public class PomGenerator extends AbstractMojo{

	@Parameter(property="groupId", required=true)
	private String groupId;

	@Parameter(property="artifactId", required=true)
	private String artifactId;

	@Parameter(property="version", required=true)
	private String version;

	@Parameter(property="packaging", defaultValue="jar")
	private String packaging;

	@Parameter(property="name")
	private String name;

	@Parameter(property="description")
	private String description;

	@Parameter(property="url")
	private String url;

	@Parameter(property="inceptionYear")
	private String inceptionYear;

	@Parameter(property="organization")
	private OrganizationModel organization;

	@Parameter(property="dependencies")
	private List<DependencyModel> dependencies;

	public void execute() throws MojoExecutionException, MojoFailureException {
		Model model = new Model();

		model.setGroupId(groupId);
		model.setArtifactId(artifactId);
		model.setVersion(version);
		model.setPackaging(packaging);

		if(name != null){
			model.setName(name);
		}
		else{
			model.setName(artifactId);
		}

		if(description != null){
			model.setDescription(description);
		}

		if(url != null){
			model.setUrl(url);
		}

		if(inceptionYear != null){
			model.setInceptionYear(inceptionYear);
		}

		if(organization != null){
			model.setOrganization(organization);
		}

		if(dependencies != null){
			for(DependencyModel dm : dependencies){
				model.addDependency(dm);
			}
		}

		try {
			new MavenXpp3Writer().write(System.out, model);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
