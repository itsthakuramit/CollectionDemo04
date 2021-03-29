package com.stackroute.recap;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.recap.old.StepOne;

public class StepOneTest {
     
	static StepOne stepOne;
	String sentence = "Welcome to java fullstack training";
	String nullsentence = null;
	String emptysentence = "";
	
	
	@BeforeClass
	public static void init() {
		stepOne = new StepOne();
	}
	
	
	@Test
	public void testgetAllTextsSuccess() {
		String[] actualData = stepOne.getAllTexts(sentence);
		String[] expectedData = new String[] {"Welcome","to","java","fullstack","training"};
		assertEquals(5,actualData.length);
		assertNotNull(actualData);
		assertArrayEquals(expectedData, actualData);
	}

	@Test
	public void testgetAllTextsForNull() {
		String[] actualData = stepOne.getAllTexts(nullsentence);
		assertNull(actualData);
		
	}

	
	@Test
	public void testgetAllTextsForEmptySentence() {
		String[] actualData = stepOne.getAllTexts(emptysentence);
		String[] expectedData = new String[] {};
		assertArrayEquals(expectedData, actualData);
	}

	@Test
	public void testgetTextbasedonIndex() {
		String actualData = stepOne.getTextbasedonIndex(sentence,2);
		String expectedData = "java";
		
		assertEquals(expectedData, actualData);
		
	}
	
}
