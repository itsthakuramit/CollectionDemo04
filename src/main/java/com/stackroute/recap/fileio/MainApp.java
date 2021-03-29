package com.stackroute.recap.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class MainApp {

	public static void main(String[] args) throws IOException {
		FileDemo.dataReading(new File("C:\\abc.txt"));
	}

}
