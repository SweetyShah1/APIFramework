package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;

public class TC2_GetAllRequest 
{
	public void testCase2() throws IOException
	{
		Properties pr= PropertiesLoad.HandleProperties("../APIFramwW/URI.properties");
		HTTPMethods http= new HTTPMethods(pr);
		http.GetAllMethod("QA_URI");
		
	}

}
