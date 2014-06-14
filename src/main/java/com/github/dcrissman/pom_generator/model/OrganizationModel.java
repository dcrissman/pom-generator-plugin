package com.github.dcrissman.pom_generator.model;

import java.util.Map;

import org.apache.maven.model.Organization;

public class OrganizationModel extends Organization{

	private static final long serialVersionUID = -5822243137160688206L;

	public static final String KEY_NAME = "name";
	public static final String KEY_URL = "url";

	public void set(String argString){
		Map<String, String> params = Parser.parseArgs(argString);

		setName(params.get(KEY_NAME));
		setUrl(params.get(KEY_URL));
	}

}
