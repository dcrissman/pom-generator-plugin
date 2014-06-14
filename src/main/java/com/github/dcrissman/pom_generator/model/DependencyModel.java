package com.github.dcrissman.pom_generator.model;

import java.util.Map;

import org.apache.maven.model.Dependency;

public class DependencyModel extends Dependency{

	private static final long serialVersionUID = -6692142580733744681L;

	public static final String KEY_GROUP_ID = "groupId";
	public static final String KEY_ARTIFACT_ID = "artifactId";
	public static final String KEY_VERSION = "version";

	public void set(String argString){
		Map<String, String> params = Parser.parseArgs(argString);

		setGroupId(params.get(KEY_GROUP_ID));
		setArtifactId(params.get(KEY_ARTIFACT_ID));
		setVersion(params.get(KEY_VERSION));
	}

}
