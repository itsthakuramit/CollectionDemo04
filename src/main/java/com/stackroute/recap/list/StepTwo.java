package com.stackroute.recap.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StepTwo {
	
	String[] techArray = {"Java", "Python", "C#", "MERN", "MEAN"};
	
	public List<String> getAllTexts(String sentence) {
		List<String> splittedText = new ArrayList<String>();
		
		if(sentence == null)
			return null;
		
		if(sentence.length() > 0) {
			splittedText = Arrays.asList(sentence.split(" "));
		}
		return splittedText;
	}
	
	
	
	public List<Technology> getTechnologies(String sentence) {
		List<Technology> techlist = new ArrayList<>();
		Technology tech=null;
		List<String> getTexts = getAllTexts(sentence);
	
		if(!getTexts.isEmpty()) {
		
			for(int i=0;i<getTexts.size();i++) {
				for(String tec: techArray) {
					if(getTexts.get(i).equalsIgnoreCase(tec)) {
						tech = new Technology();
						tech.setTechindex(i);
						tech.setTech(tec);
						techlist.add(tech);
					}
				}
			}
			
		}
		return techlist;
	}
	
	
}
