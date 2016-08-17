package com.core.jsonparser.util;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AppUtil {
	/**
	 * 
	 * @param path
	 * @param encoding
	 * @return string of jsonfile
	 * @throws IOException
	 */
	public static String readFile(String path, Charset encoding)throws IOException{
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded,encoding);
	}
	
}
