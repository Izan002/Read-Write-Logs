package logs;

import java.io.*;

import java.util.Scanner;

import java.util.Scanner;

public class LogAnalyse {

	private static final String FILE = "C:\\Users\\Administrator\\Documents\\Dev\\log\\log.txt59";

	 public static void main(String[] args) {

	  try (BufferedReader br = new BufferedReader(new FileReader(FILE)))  {
		  
		  File outFile = new File("C:\\\\Users\\\\Administrator\\\\Documents\\\\Dev\\\\log\\\\consoleLog.txt");
	        
	        outFile.getParentFile().mkdirs(); 
	        
	        Writer writer = new FileWriter(outFile);

	        BufferedWriter br1 = new BufferedWriter(writer, 16384);
	   
		 String strCurrentLine;

	   





	while ((strCurrentLine = br.readLine()) != null) {
		   
		   if (strCurrentLine.contains("your_word") ) {
			   
			   
		        br1.write(strCurrentLine);
		        br1.newLine();  
		 
		        br1.flush();
		   
		        
		     	// Writing lines saved in a txt file
			} else if(strCurrentLine.contains("your_word")) {
		    	 br1.write(strCurrentLine);
			        br1.newLine();  
			 
			        br1.flush();
		     }
	    
	   }

	  } catch (IOException e) {
	   e.printStackTrace();
	  }
	 }
	
}