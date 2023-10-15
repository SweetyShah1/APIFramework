package org.testing.testScripts;


import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;
import org.testing.utilities.handleJsonFile;

public class TC1_PostRequest 
{

	public static void main(String[] args) throws IOException 
	{
		Properties pr= PropertiesLoad.HandleProperties("../APIFramwW/URI.properties");
		String requestBody= handleJsonFile.ReadJsonFile("../APIFramwW/src/test/java/org/testing/resources/RequestBody.json");
		
		HTTPMethods http= new HTTPMethods(pr);
		http.PostMethod(requestBody, "QA_URI");
	}
}
