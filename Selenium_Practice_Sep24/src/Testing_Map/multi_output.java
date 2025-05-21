package Testing_Map;
import java.util.Scanner;

import org.testng.annotations.Test;
public class multi_output {
	
	@Test(enabled = false)
    public void thrice() {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for input
	        System.out.print("Enter a name: ");
	        String name = scanner.nextLine();

	        // Initialize a StringBuilder to construct the transformed name
	        StringBuilder transformedName = new StringBuilder();

	        // Loop through each character in the name
	        for (char c : name.toCharArray()) {
	            if (c == name.charAt(0)) {
	                transformedName.append(c);  // Append the first letter just once
	            } else {
	                transformedName.append(c).append(c).append(c);  // Append other letters thrice
	            }
	        }

	        // Output the transformed name
	        System.out.println("Transformed name: " + transformedName);

	        // Close the Scanner
	        scanner.close();
	    }
	

	@Test
	    public void continues() {
	      
	        String name = "name";

	        // Initialize a StringBuilder to construct the transformed name
	        StringBuilder transformedName = new StringBuilder();

	        // Loop through each character in the name
	        for (int i = 0; i < name.length(); i++) {
	            char c = name.charAt(i); // Get the character at the current index
	            if (i == 0) {
	                transformedName.append(c); // Append the first letter only once
	            } 
	            else if (i == 1) {
	                transformedName.append(c).append(c); // Append the first letter only once
	            } 
	            else {
	                transformedName.append(c).append(c).append(c); // Append other letters thrice
	            }
	        }

	        // Output the transformed name
	        System.out.println("Transformed name: " + transformedName);

	        }
	@Test
	public class NameTransformer {
	    public void dynamic() {
	        String name = "kasa";
	        int repeatCount = 3; // Change this number for different repetitions
	        StringBuilder transformedName = new StringBuilder();

	        for (char c : name.toCharArray()) {
	            for (int i = 0; i < repeatCount; i++) {
	                transformedName.append(c);
	            }
	        }

	        System.out.println("Transformed name: " + transformedName);
	    }
	}

	}

	


