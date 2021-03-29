package com.stackroute.recap;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.recap.list.StepTwo;
import com.stackroute.recap.list.Technology;
import com.stackroute.recap.old.StepOne;

public class StepTwoTest {

	static StepTwo stepTwo;
	String sentence = "We offer training on Java MERN and MEAN stack";
	String nullsentence = null;
	String emptysentence = "";
	List<String> expectedData = new ArrayList<>();
	List<Technology> expectedTechData = new ArrayList<>();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		stepTwo = new StepTwo();
	}

	@Test
	public void testGetAllTexts() {
		expectedData.add("We");
		expectedData.add("offer");
		expectedData.add("training");
		expectedData.add("on");
		expectedData.add("Java");
		expectedData.add("MERN");
		expectedData.add("and");
		expectedData.add("MEAN");
		expectedData.add("stack");
		List<String> actualData = stepTwo.getAllTexts(sentence);
		assertEquals(expectedData, actualData);
		
	}

	@Test
	public void testGetTechnologies() {
		Technology t1 = new Technology(4,"Java");
		expectedTechData.add(t1);
		Technology t2 = new Technology(5,"MERN");
		expectedTechData.add(t2);
		Technology t3 = new Technology(7,"MEAN");
		expectedTechData.add(t3);
		
		List<Technology> actualTechData = new ArrayList<>();

		actualTechData = stepTwo.getTechnologies(sentence);
		assertEquals(expectedTechData.get(0).getTechindex(),actualTechData.get(0).getTechindex());
		assertEquals(expectedTechData.get(0).getTech(),actualTechData.get(0).getTech());
		
		assertEquals(expectedTechData.size(),actualTechData.size());
	}

}
