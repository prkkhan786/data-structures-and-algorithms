package Largefiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Stripper {

	 public static void removeDupes(String filename, int chunkSize) throws IOException {
		    //@ Validate user input. Filename can't be null; Chunk size has to be >=1
		    
		    // Note - BufferedReader is NOT loading the entire file into mem
		    BufferedReader reader = new BufferedReader(new FileReader(filename));
		    Set<String> uniqueLines = new HashSet<String>(chunkSize);
		    List<Set<String>> chunks = new ArrayList<Set<String>>();
		    String line;
		    while((line = reader.readLine()) != null) {
		      uniqueLines.add(line);
		      if(uniqueLines.size() == chunkSize) {
		        // Save a copy of the lines using copy constructor
		        chunks.add(new HashSet<String>(uniqueLines));
		        uniqueLines.clear();
		      }
		    }
		    reader.close();

		    // If size of uniqueLines is not equal to chunkSize, we haven't saved it yet
		    if(uniqueLines.size() != chunkSize) {
		      chunks.add(new HashSet<String>(uniqueLines));
		      uniqueLines.clear();
		    }
		    
		    // Although the final list could be smaller than chunkSize,
		    // it's a good approximation of the minimum size of the final set
		    Set<String> consolidated = new HashSet<String>(chunkSize);
		    for(Set<String> buff : chunks) {
		      consolidated.addAll(buff);
		    }

		    for(String congo : consolidated) {
		      System.out.println("<"+congo+">");
		    }
		  }
	 public static void main(String args[]) throws IOException{
		 // How many lines do we want to hold in memory?
	        // We'll use 2 for our test cases. Otherwise
	        // 2^13 = 8,192 seems like a good nbr
	        final int chunkSize = 2;
	        final String filename = "Stripper.txt";
	        BufferedWriter writer;
	        int testCaseNbr = 1;
	        
	        
	        
	        
	        // Test Case - Simple one
	        System.out.println("Test Case Nbr<"+testCaseNbr+">");
	        writer = new BufferedWriter(new FileWriter(filename));
	        writer.write("This is my line.\n");
	        writer.write("There are many like it,\n");
	        writer.write("but this one is mine.\n");
	        writer.write("\n");
	        writer.write("This is my line.\n"); // DUPE
	        writer.close();
	        removeDupes(filename, chunkSize);
	 }
}
