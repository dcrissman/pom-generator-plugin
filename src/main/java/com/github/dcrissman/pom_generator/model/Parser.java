package com.github.dcrissman.pom_generator.model;

import java.util.HashMap;
import java.util.Map;

public class Parser {

	public static final String PARAM_DIVIDER = ":";
	public static final String KEY_VALUE_DIVIDER = "=";

	public static Map<String, String> parseArgs(String argString){
		Map<String, String> params = new HashMap<String, String>();

		for(String arg : argString.split(PARAM_DIVIDER)){
			String[] keyValue = arg.split(KEY_VALUE_DIVIDER);

			if(keyValue.length != 2){
				throw new RuntimeException("invalid param: " + arg);
			}

			String key = keyValue[0];
			String value = keyValue[1];

			if(key == null || key.trim().isEmpty()){
				throw new RuntimeException("key must be provided");
			}
			else if(value == null || value.trim().isEmpty()){
				throw new RuntimeException("value must be provided for key: " + key);
			}

			params.put(key, value);
		}

		return params;
	}

}
