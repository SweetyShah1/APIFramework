package org.testing.testScripts;


import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonVariableReplace;
import org.testing.utilities.PropertiesLoad;
import org.testing.utilities.handleJsonFile;

public class TC1_PostRequest 
{

	public void testCase1() throws IOException 
	{
		Properties pr= PropertiesLoad.HandleProperties("../APIFramwW/URI.properties");
		String requestBody= handleJsonFile.ReadJsonFile("../APIFramwW/src/test/java/org/testing/resources/RequestBody.json");
		
		Random r= new Random();
		Integer id= r.nextInt();
		requestBody= JsonVariableReplace.JsonReplacement(requestBody, "id", id.toString());
		HTTPMethods http= new HTTPMethods(pr);
		http.PostMethod(requestBody, "QA_URI");
	}
	
}
