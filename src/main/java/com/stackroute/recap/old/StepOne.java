package com.stackroute.recap.old;

public class StepOne {
	
	
	public String[] getAllTexts(String sentence) {
		if(sentence == null)
			return null;
		if(sentence.length() > 0) {
			String[] splittedText = sentence.split(" ");
			return splittedText;
		}else {
			return new String[] {};
		}
	}
	
	
	public String getTextbasedonIndex(String sentence,int index) {
		return getAllTexts(sentence)[index];
	}
	
	
}
