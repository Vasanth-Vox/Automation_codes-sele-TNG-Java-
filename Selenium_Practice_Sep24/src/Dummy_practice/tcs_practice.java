package Dummy_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class tcs_practice {

	public void Uplpwer() {
		
		String java = "heLLO WelcomE alL";
		//int upp = 0;
		//int Low = 0;
		String ups = "";
		String lows = "";
	
		for( char ch : java.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				ups = ups + ch;
				
			}
			else if (Character.isLowerCase(ch)) {
				lows = lows + ch;
			
			}
		
	}
		System.out.println("Upper count is" + ups);
		System.out.println("Lower count is" + lows);
}
	
	
	public void splits() {
		String words = "heloo vankam vantha";
		String[] split = words.split(" ");
		for (String names : split) {
			StringBuilder SB = new StringBuilder();
			SB.append(names);
			System.out.println(SB);
		}
	}
	
	public void palidrome() {
		String pali = "HelleH";
		StringBuilder bil = new StringBuilder();
		bil.append(pali);
		bil.reverse();
		System.out.println(bil);
		
		if (pali.equals(bil.toString())) {
			System.out.println("Its a palidrome");
		}
		else {
			System.out.println("Its not a palidrome");
		}
	}
	
	public void Multiwordreverse() {
		String multi = "CTS working Vasa";
		String[] word = multi.split(" ");
		StringBuilder build = new StringBuilder();
		for (int i = word.length-1;i>=0;i--) {
			build.append(word[i]).append(" ");
		}
		System.out.println(build);
	}
	
	public void uniquereverse() {
		String names = "Today interview in TCS cmpany";
		String[] splits = names.split("Today|TCS");
		StringBuilder SB = new StringBuilder();
		SB.append("TCS");
		SB.reverse();
		StringBuilder SB1 = new StringBuilder();
		SB1.append("Today");
		SB1.reverse();
		String val = SB1 + splits[1] + SB + splits[2];
		System.out.println(val);
	}
	
	public void intduplicates() {
		int[] dups = {2,4,3,2,5,6,8,9,3};
		
		for (int i = 0;i<dups.length-1;i++) {
			for (int j = i+1;j<dups.length;j++) {
				if (dups[i] == dups[j]) {
					System.out.println(dups[i]);
				}
			}
			
		}
		
	}
	
	public void vowelsremove() {
		String names = "Beautiful";
		String vow = "AEIOUaeiou";
		String calls = "";
		for (char c : names.toCharArray()) {
			if (!vow.contains(String.valueOf(c))) {
				calls = calls + c;
			}
		} System.out.println(" remains text " + calls);
		
	}
	
	public void findIndex() {
		String text = "Beautiful";
		//String vow = "AEIOUaeiou";
		
		for ( int i = 0 ; i< text.length();i++) {
			char c = text.charAt(i);
			//if (vow.contains(String.valueOf(c))) {
				System.out.println(" text is " + c + " index is " + i);
			}
		
	}
	
	public void findASKI() {
		String names = "vasakasa";
		for (char ch:  names.toCharArray()) {
			System.out.println("aski of " + ch + " is " + (int)ch);
		
	}
}
	
	public void intsorts() {
		 Integer[] nums = {2,5,4,7,0,8};
		Arrays.sort(nums);
		System.out.println("ascending order " + Arrays.toString(nums));
		
		Arrays.sort(nums,Collections.reverseOrder());
		System.out.println("decending order " + Arrays.toString(nums));
	}

	public void sortsList() {
		ArrayList<Integer> nums = new ArrayList<>();
		Collections.addAll(nums, 2,4,3,1,6,5,8,9);
		Collections.sort(nums);
		System.out.println("ascending order " + nums);
		Collections.sort(nums, Collections.reverseOrder());
		System.out.println("decending order " + nums);
	}

		public void reversenum() {
			int num = 54321;
			int rnum = 0;
			while(num>0) {
			int revs =	num % 10; 
			rnum = rnum *10 + revs;
			num = num /10;
			}
			
			System.out.println(rnum);
		}

		public void intduplicatesList() {
			int[] dups = {2,4,3,2,5,6,8,9,3};
			Set<Integer> dupss = new HashSet<Integer>();
			for (int i = 0;i<dups.length-1;i++) {
				for (int j = i+1;j<dups.length;j++) {
					if (dups[i] == dups[j]) {
						dupss.add(dups[i]);
						System.out.println(dups[i]);
					}
				}
				
			}
			
		}
		public void remvedup() {
		int[] dups = {2,4,3,2,5,6,8,9,3};
		Set<Integer> dupss = new HashSet<Integer>();
		for (Integer inte : dups) {
			dupss.add(inte);
		}
		System.out.println("du is " + dupss);
		
		}
		
		public void mixing() {
			String vals = "ABC345efg@!_";
			String uper = "";
			String lower = "";
			String Num = "";
			String SPS = "";
			
			for (char ch : vals.toCharArray()) {
				if (Character.isUpperCase(ch)) {
					uper = uper + ch;
				}
				else if (Character.isLowerCase(ch)) {
					lower = lower + ch;
				}
				else if (Character.isDigit(ch)) {
					Num = Num + ch;
				}
				else {
					SPS = SPS + ch;
				}
			}
			
			
			System.out.println("Upper is " + uper);
			System.out.println("Lower is " + lower);
			System.out.println("Digit is " + Num);
			System.out.println("SPS is " + SPS);
		}
		
		public void firstminmax() {
			int[] arr = { 2,3,1,5,67};
			
			int max = arr[0];
			int min = arr[0];
			
			for (int nums : arr) {
				if (nums>max) {
					max = nums;
				}
				else if (nums<min) {
					min = nums;
				}
			}
			
			System.out.println("max is " + max );
			System.out.println("min is " + min );
		}
		
		public void Ocurance() {
			String name = "vasaKAsakusa";
			char ch = 'a';
			int occunt = 0;
			name = name.toLowerCase();
			for (char fch : name.toCharArray()) {
				if ( fch == ch) {
					occunt++;
					
				}
			} System.out.println("OCC is " + occunt );
		}
		
		public void occwithoutIt() {
			String name = "vasaKAsakusa";
			char ch = 'a';
			name = name.toUpperCase();
		int ORGNIAL = name.length();
		System.out.println("org count is " + ORGNIAL);
		String crt = Character.toString(ch).toUpperCase();
		String newname = name.replace(crt, "");
		int update = newname.length();
		int output = ORGNIAL - update;
		System.out.println("OCC is " + output);
		
		}
		
		public void entirereverse() {
			String name = " vasanth is here today";
			String[] split = name.split("//s");
			String reverse = "";
			for (String ch : split) {
				StringBuilder SB = new StringBuilder(ch);
				SB.reverse();
				reverse = reverse + SB.toString() + " ";
				
			}
			System.out.println("rewverse tet  is " + reverse);
		}
		
		public void addeven() {
			int num = 8;
			if (num %2==0) {
				System.out.println( num + " is even");
			}
			else if (num %2!=0) {
				System.out.println( num + " is odd");
			}
		}
		
		public void edef() {
			int[] num = {2,3,4,21};
			int add = 0;
			int even = 0;
			
			for ( int count : num) {
				if (count %2!=0) {
					add = add + count;
				}
				else if (count %2==0) {
					even = even + count;
				}
			}
			System.out.println( add + " is add");
			System.out.println( even + " is even");
		}
		
		public void prime() {
			int num = 91;
			boolean isprime = true;
			
			if (num<=1) {
				isprime = false;
			}
			else {
				for ( int i = 2; i<num;i++) {
					if (num % i ==0) {
						isprime = false;
						break;
					}
				}
			} 
			System.out.println(num + (isprime ? "its prmie " : "not a prime"));
			//System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));
		}
		
		public void readxlfie() throws FileNotFoundException {
			String file = "sdadada";
			FileInputStream fis = new FileInputStream(file);
			try {
				XSSFWorkbook book = new XSSFWorkbook(fis);
				XSSFSheet sheet = book.getSheetAt(0);
				int row = sheet.getLastRowNum();
				int cell = sheet.getRow(0).getLastCellNum();
				
				for ( int i = 1;i<=row;i++) {
					XSSFRow Nrow = sheet.getRow(i);
					for (int j = 0;j<cell;j++) {
						XSSNrow.getCell(i);
					}
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			public void splitsnum() {
				String words = "heloo 1234 vankam vantha";
				String[] split = words.split("\\D+", " ");
				for (String names : split) {
					StringBuilder SB = new StringBuilder();
					SB.append(names);
					System.out.println(SB);
				}
			}
			
		
}