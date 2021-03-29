package com.stackroute.recap.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class FileDemo {
	
	
	public static void dataReading(File file) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String newline="";
		while((newline = br.readLine()) != null ) {
			System.out.println(newline.matches("([0-9])\\w+"));
		}
		
		
	}
	
}
