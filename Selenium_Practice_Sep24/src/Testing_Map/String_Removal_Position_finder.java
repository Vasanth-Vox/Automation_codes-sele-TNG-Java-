package Testing_Map;

import org.testng.annotations.Test;

public class String_Removal_Position_finder {

	public void remoal_letters_instring(){
		// TODO Auto-generated method stub
				        // Input string
		        String input = "Beautiful";
		        
		        // Define the vowels
		        String vowels = "aeiouAEIOU";
		        
		        // Initialize a StringBuilder to store the result
		        StringBuilder result1 = new StringBuilder();
		        
		        // Iterate through each character in the input string
		        for (char c : input.toCharArray()) {
		            // If the character is not a vowel, append it to the result
		            if (!vowels.contains(String.valueOf(c))) {
		                result1.append(c);
		            }
		        }
		        
		        // Print the remaining characters
		        System.out.println("String after removing vowels: " + result1.toString());
		    }
		

	@Test
    public void positioninstring(){
        // Input string
        String input = "Beautiful";
        
        // Define the vowels
        String vowels = "aeiouAEIOU";
        
        // Iterate through each character in the input string
        System.out.println("Positions of vowels in the string:");
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i); // Get the character at position i
            
            // Check if the character is a vowel
            if (vowels.contains(String.valueOf(c))) {
            	
                System.out.println("Vowel '" + c + "' found at position " + i);
            }
        }
    
		/*
		 * String s1 = "vasa"; String s2 = "vasa"; String s3 = new String("vasa");
		 */
    
    
    }
}


