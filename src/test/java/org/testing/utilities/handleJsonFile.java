package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class handleJsonFile
{
	public static String ReadJsonFile(String jsonfilepath) throws FileNotFoundException
	{
		File f= new File(jsonfilepath);
		FileInputStream fi= new FileInputStream(f);
		JSONTokener js= new JSONTokener(fi);
		JSONObject j= new JSONObject(js);
		return j.toString();
	}

	

}
