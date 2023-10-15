package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoad 
{
	public static Properties HandleProperties(String filepath) throws IOException
	{
		File f= new File(filepath);
		FileInputStream fi= new FileInputStream(f);
		Properties pr= new Properties();
		pr.load(fi);
		return pr;
	}
	
}
