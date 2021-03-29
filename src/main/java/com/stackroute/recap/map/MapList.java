package com.stackroute.recap.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class MapList {
	
	
	public LinkedHashMap<String,List<String>> getAllCarModels(List<String> carlist){
		
		LinkedHashMap<String,List<String>> carMap = new LinkedHashMap<>();
		
		String newcar="newcar";
		
		carMap.put("newcarmodels",carlist);
		
		return carMap;
	}
	
	
}
