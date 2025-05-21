package Java;

public class String_methods {

	public static void main(String[] args) {
		// String methods
		String object = " vasanth-kopika";
		
		System.out.println(object.charAt(5));
		System.out.println(object.length());
		System.out.println(object.equals("vasanth"));
		System.out.println(object.equalsIgnoreCase("Vasanth-Kopika"));
		System.out.println(object.isEmpty() +"gh" + object.isBlank());
		System.out.println(object.contains("pika"));
		System.out.println(object.substring(2));
		System.out.println(object.substring(2,9));
		System.out.println(object.concat("lovers"));
		System.out.println(object.replace("kopika","gopika"));
		System.out.println(object.indexOf("h"));
		System.out.println(object.indexOf("a", 8));
		System.out.println(object.indexOf("opi",4));
		System.out.println(object.trim());
		String object1 = "vasanth-kopika";
		System.out.println(object1.toUpperCase());
		System.out.println(object1.toLowerCase());
		int value = 5;
		System.out.println(String.valueOf(value));
		System.out.println(String.join("*","vasanth","loves","kopika"));
		System.out.println(String.join("-","vasanth","loves","kopika"));
		String sep = "vasanth, is,a,goog,boy,until,he,gets,angry";
		String [] finalyy = sep.split(",");
		for (String string : finalyy) {
			System.out.println(string.trim());
		}
		
		// String Buffer / Builder methods
		System.out.println("buffewrs output"
); 		StringBuffer buffer = new StringBuffer("vasanthweds");
		buffer.append("kopika");
		System.out.println(buffer.reverse());
		
		StringBuffer buffer1 = new StringBuffer("vasanthweds");
		System.out.println(buffer1.replace(6, 9, "love"));
		
		StringBuffer buffer2 = new StringBuffer("vasanth");
		System.out.println(buffer2.delete(0, 2));
		
		StringBuffer buffer3 = new StringBuffer("vasanthweds");
		System.out.println(buffer3.insert(10, "kopika"));
		
		StringBuffer buffer4 = new StringBuffer("vasanthweds");
		System.out.println(buffer4.capacity());
		
		
		//https://author-p66763-e620303.adobeaemcloud.com/editor.html/content/cognizant-dot-com/us/en/regressionteaser.html
			//https://author-p66763-e620303.adobeaemcloud.com/content/cognizant-dot-com/us/en/regressionteaser.html?wcmmode=disabled
			//https://publish-p66763-e620303.adobeaemcloud.com/us/en/regressionteaser
		

	}

}
