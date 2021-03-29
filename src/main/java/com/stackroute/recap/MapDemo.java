package com.stackroute.recap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	
	
	public static void main(String[] args) {
		
		Map<String,String> books = new TreeMap<>();
		books.put("Ayn Rand", "We the living");
		books.put("RK Narayanan", "Swami and friends");
		books.put("Chetan Bhagat", "2 states");
		books.put("Anonymous", "Indulekha");
		
		// books - map object - String, String
		// entry set - set object - this is created for the multiple entries in the Map
		// iterator - iteration object - this works on set objects
		Iterator booksetitr = books.entrySet().iterator();
		while(booksetitr.hasNext()) {
			
			Map.Entry<String, String> book = (Entry<String, String>) booksetitr.next();
			System.out.println(book.getKey() + " " + book.getValue());

			
		}
		
	}
	
}
