package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonVariableReplace 
{
	public static String JsonReplacement(String reqBody, String VariableName, String VariableValue)
	{
		reqBody= reqBody.replaceAll(Pattern.quote("{{" + VariableName + "}}"), VariableValue);
		return reqBody;
	}

}
