package Dummy_practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class String_pper_lower_01 {

	//@Test
	public void countodUpperLower(){
		// TODO Auto-generated method stub
		String str = "JAva is Tuff or whaT";
		int upper = 0;
		int lower = 0;
		for(char chr: str.toCharArray()) {
			if(Character.isUpperCase(chr)) {
				upper++;
			}
			else if(Character.isLowerCase(chr)) {
				lower++;
			}
			
		}
System.out.println("total upper count is " + upper);
System.out.println("total lower count is " + lower);
	}
	
	//@Test
	public void separateStrinUpperLower() {
		String str = "VASanth loVEs GopikA";
		//StringBuilder upper = new StringBuilder();
		//StringBuilder lower = new StringBuilder();
		String upper = "";
		String lower = "";
		
		for(char ch: str.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				//upper.append(ch);
				upper=upper+ch;
			}
			else if(Character.isLowerCase(ch)) {
				//lower.append(ch);
				lower=lower+ch;
			}
		}
		System.out.println("Upper case is" + upper);
		System.out.println("Lower case is " + lower);
	}
	
	//@Test
	public void splitstring() {
		//String str = "vasanth";
		String str = "vasanth;gopz;weds;soon";
		String[] split = str.split(";");
		for (String S : split) {
			System.out.println(S);
			
		}
		
	}
	
	//@Test
	public void reverseString_palidrome() {
		String str = "HelleH";
		StringBuilder build = new StringBuilder();
		build.append(str);
		build.reverse();
		System.out.println(build);
		if(str.equals(build.toString())) {
			System.out.println("its a palidrome");
		} else {
			System.out.println("its not a palindrme");
		}
		
	}
	//@Test
	public void multiword_reverse() {
		String str = "vasanth chennai india now";
		String[] split = str.split(" ");
		StringBuilder SB = new StringBuilder();
		for(int i=split.length-1;i>=0;i--) {
			SB.append(split[i]).append(" ");
	
		}
		System.out.println(SB);
	}

	//@Test
	public void reverse_unique_text() {
		String input = "welcome to chennai";
		String[] str = input.split("chennai");
		StringBuilder bil = new StringBuilder();
		bil.append("chennai");
		bil.reverse();
		String output = str[0] + bil;
		System.out.println(output);
	}
	
	
		//@Test
		public void reverse_unique_texts() {
			String input = "welcome to chennai and india";
			String[] str = input.split("chennai|india");
			StringBuilder bil = new StringBuilder();
			bil.append("chennai");
			bil.reverse();
			StringBuilder bil2 = new StringBuilder();
			bil2.append("india");
			bil2.reverse();
			String output = str[0] + bil +  str[1] + bil2;
			System.out.println(output);
		
		
	}
		
		//@Test
		public void PartialStringReverse() {
				String input = "welcome to chennai and india";
				String[] str = input.split("welcome|and");
				StringBuilder bil = new StringBuilder();
				bil.append("welcome");
				bil.reverse();
				StringBuilder bil2 = new StringBuilder();
				bil2.append("and");
				bil2.reverse();
				String output = bil + str[1]+ bil2 + str[2];
				System.out.println(output);
		}
		
		//@Test
		public void duplicate() {
			int[] dup = {1,2,3,4,6,7,2,4};
			for(int i=0;i<dup.length-1;i++) {
				for(int j=i+1;j<dup.length;j++) {
					if (dup[i] == dup[j]) {
						System.out.println("duplicate us " + dup[i]);
					}
				}
			}

		}
		
		//@Test
		public void vowelsPRINT() {
			//String vowels = "Beautiful";
			//String org = "AEIOUaeiou";
			String vowels = "VASANTH";
			String org = "AEOIU";
			StringBuilder buil = new StringBuilder();
			
			for (char c : vowels.toCharArray()) {
				if(!org.contains(String.valueOf(c))) {
					buil.append(c);
				}
			
			}
			System.out.println("remain text is" + buil);
		}

 //@Test
 public void indexofString() {
	 String name = "VASANTH";
	 String vowel = "AEIOUaeiou";
	 
	 for (int i=0;i<name.length();i++) {
		char c =  name.charAt(i);
		if(vowel.contains(String.valueOf(c))) {
			System.out.println("text is " + c + "index is " + i);
		}
		
	 }
 }
 
 //@Test
 public void ASKi() {
	 String aski = "Am a gangster";
	 for(char c :aski.toCharArray()) {
		 System.out.println("aski value of" + c + "is " + (int)c);
	 }
	 
 }
 
 //@Test
 public void ASC_Desc() {
	 
	         Integer[] numbers = {5, 2, 9, 1, 6};

	         // Ascending order
	         Arrays.sort(numbers);
	         System.out.println("Ascending: " + Arrays.toString(numbers));

	         // Descending order
	         Arrays.sort(numbers, Collections.reverseOrder());
	         System.out.println("Descending: " + Arrays.toString(numbers));
	     }
	 
 //@Test
 public void list() {
	 ArrayList<Integer> num = new ArrayList<>();
	 //Collections.addAll(num, 2,5,4,6);
	 num.add(4);
	 num.add(2);
	 num.add(1);
	 
	 Collections.sort(num);
	 System.out.println("ascending " + num);
	 
	 Collections.sort(num, Collections.reverseOrder());
	 System.out.println("decend" + num);
	 
	 //uppercase -lower case
	 String name = "vasaNth";
	 name.toCharArray();
	 name.toLowerCase();
	 name.toUpperCase();
	 
 }
 
 //@Test
 public void reversenum() {
	 
		/*
		 * Scanner SC = new Scanner(System.in); int reverse = 0;
		 * System.out.println("Enter ur number"); int Onum = SC.nextInt();
		 */
	 int Onum = 123456;
	 int reverse = 0;
	 while(Onum>0) {
		int reminder = Onum % 10;
		reverse = reverse * 10 + reminder;
		Onum = Onum / 10;
		
	 }
	 System.out.println("reversed number is " + reverse); 
 }
 
 //@Test
 public void find_dup_use_set() {
	 int[] dup = {1, 2, 3, 4, 6, 7, 2, 4};
     Set<Integer> duplicates = new HashSet<>();

     for (int i = 0; i < dup.length - 1; i++) {
         for (int j = i + 1; j < dup.length; j++) {
             if (dup[i] == dup[j]) {
                 duplicates.add(dup[i]); // Add duplicate to the set
                 System.out.println("Duplicate is: " + dup[i]);
             }
         }
     } //System.out.println("Duplicate is: " + duplicates);
 }
 
 //@Test
 public void remove_dup_set() {
	 int[] dup = {1, 2, 3, 4, 6, 7, 2, 4};
     Set<Integer> duplicates = new HashSet<>();
     for (int newd: dup) {
    	 duplicates.add(newd);
     }
     System.out.println("remain is " + duplicates);
 }
 
 //@Test
 public void separate_up_low_SP() {
	 String num = "ABcd12@#$";
	 String upper = "";
	 String lower = "";
	 StringBuilder sb = new StringBuilder();
	 String Speciachar = "";
	 
	 for(char ch: num.toCharArray()) {
		 if(Character.isUpperCase(ch)) {
			 upper = upper + ch;
		 }
		 else if(Character.isLowerCase(ch)) {
			 lower = lower + ch;
		 }
		 else if(Character.isDigit(ch)) {
			sb.append(ch);
		 }
		 else {
			 Speciachar = Speciachar + ch;
		 }
	 }
	 System.out.println("Caps is " + upper);
	 System.out.println("Lower is " + lower);
	 System.out.println("digit is " + sb);
	 System.out.println("SP is " + Speciachar);
	 
	 
	 
 }
 
 //@Test
 public void find_ma_min_array() {
	 // Array num = new Array();
	 
	 int[] arr = {3,5,71,-2,0,1};
	 int max = arr [0];
	 int min = arr [0];
	 
	 for (int num: arr) {
		 if(num>max) {
			 max = num;
		 }
		 else if(num<min) {
			  min = num;
		 }}
		 System.out.println("max is " + max);
		 System.out.println("mn is " + min);
 } 
	 

 //@Test
 public void Occurance_Strng() {
	 String str = "VasanthaKumAr";
	 char ch = 'a';
	 int occurancecoiunt = 0;
	 str = str.toLowerCase();
	 
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i) == ch) {
	// for (char aa : str.toCharArray()) {
		 //if(aa == ch) {
			 occurancecoiunt++;
		 }
	 }
	 System.out.println("occurancecoiunt of " +ch+"is " + occurancecoiunt);
 }
 
//@Test
public void Occurance_without_iteration() {
	 String str = "VasanthaKumAr";
	 char ch = 'a';
	 int countoc = 0;
	 str = str.toUpperCase();
	 String crt = Character.toString(ch).toUpperCase();
	 
	 int Orglength = str.length();
	 System.out.println("org is " + Orglength);
	 String replace = str.replace(crt, "");
	 int AfterLengt = replace.length();
	 System.out.println("After lenth  is " + AfterLengt);
	 int finalcount = Orglength - AfterLengt;
	 System.out.println("final count is " + finalcount);
 
 
}

//@Test
public void charsinString(){
   
        // Input word
        String word = "Java";
        String charsc = "";
        // Iterate through each character in the word
        for (int i = 0; i < word.length(); i++) {
            // Print the current character
        	char ch = word.charAt(i);
        	charsc  = charsc + ch;
            System.out.println("Character at position " + ch + "is" + i);
      
}}

//@Test
public void entirereverse() {
	String str = "welcome everyone today";
	String[] split = str.split("//s");
	String reversed = "";
	for (String ch : split) {
		StringBuilder sb = new StringBuilder(ch);
		sb.reverse();
		reversed = reversed + sb.toString()+" ";
	}
	System.out.println(reversed);
}

  //@Test
  public void addeven() {
	  int num = 9 ;
	  
	  if (num %2==0) {
		  System.out.println(num + "num is even");
	  } else {
		  System.out.println(num + "num is odd");
	  }
  }

  //@Test
  public void oddnum() {
	  int[] num = {4,2,7,8,5};
	  int add = 0;
	  int even = 0;
	  for (int ilesa : num) {
	  
	  if (ilesa %2!=0) {
		  add += ilesa;
		//add = add +ilesa ;
	  } else {
		  even += ilesa;
 
  }
	  
  }
	  System.out.println(add + " is sum of odd");
	  System.out.println(even + "is sum of even");
 
  }
   
  //@Test
  public void Occ_char_map() {
          String str = "hello world";
          HashMap<Character, Integer> charCountMap = new HashMap<>();

          for (char c : str.toCharArray()) {
              if (charCountMap.containsKey(c)) {
                  charCountMap.put(c, charCountMap.get(c) + 1);
              } else {
                  charCountMap.put(c, 1);
              }
          }

          // Print the result
          for (Character key : charCountMap.keySet()) {
              System.out.println(key + " : " + charCountMap.get(key));
          }
      }
  

//@Test
public void wordacc() {
        String sentence = "this is a test this is only a test";
        String[] words = sentence.split(" ");
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        // Print the result
        for (String key : wordCountMap.keySet()) {
            System.out.println(key + " : " + wordCountMap.get(key));
        }
    
}

		//fibonacci
	//@Test
	public void fibonacci() {
		int n = 10;
		int firsterm = 0;
		int secondterm = 1;
		System.out.println("Fibonacci Series up to " + n + " terms:");
		
		for (int i = 1;i<=n;i++) {
			 System.out.print(firsterm + " ");
			 
			 int nextterm = firsterm + secondterm;
			 firsterm = secondterm;
			 secondterm = nextterm;
			 
		}
	}
	//@Test
	public void primenum() {
		int num = 17; // Change this number to test different values
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));
    }
	
	//@Test
	    public  void nonrepeated() {
	        String str = "programming";
	        Map<Character, Integer> charCount = new HashMap<>();

	        // Count occurrences of each character
	        for (char c : str.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	        }

	        // Print non-repeated characters within the same method
	        System.out.print("Non-repeated characters: ");
	        for (Entry<Character, Integer> entry : charCount.entrySet()) {
	            if (entry.getValue() == 1) {
	                System.out.print(entry.getKey() + " ");
	            }
	        }
	    }
	    
	    
	    
	    //@Test
	    public void dup_repeatedTimes() {
	    	int[] num = {1,2,3,4,3,5,6,2,4};

	        // Using a HashMap to store occurrences
	        Map<Integer, Integer> countMap = new HashMap<>();

	        for (int number : num) {
	            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
	        }

	        // Display duplicate numbers and their counts
	        System.out.println("Duplicate numbers and their counts:");
	        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
	            }
	        }
	    }
	
	    
	    @Test
	    public void multi_primenum() {
	    	
	    	 int[] a = {2, 3, 4, 6, 5, 7, 9, 12, 10}; 
	         System.out.print("Prime numbers: ");
	         for (int num : a) { 
	             if (isPrime(num)) { 
	                 System.out.print(num + " ");
	                 } 
	             
	         } 
	         
	     } 
	     public static boolean isPrime(int num) { 
	         if (num < 2) { 
	             return false; 
	             
	         }
	             for (int i = 2; i <= Math.sqrt(num); i++) { 
	                 if (num % i == 0) {
	                     return false; 
	                     
	                 } 
	                 
	             } 
	             return true;
	     }
	}


  

  	

