package by.academy.classwork.lesson5;

public class String1 {

	public static void main(String[] args) {
		
		String s = "I like Java!!!";
		
		System.out.println("Last symbol is: " + s.charAt(13));

		System.out.println("Ends with \"!!!\" : " + s.endsWith("!!!"));
		
		System.out.println("Starts with \"I like\": " + s.startsWith("I like"));
		
		System.out.println("Contains \"Java\": " + s.contains("Java"));
		
		System.out.println("Position of \"Java\": " + s.indexOf("Java"));
		
		System.out.println("a to o : " + s.replace('a','o'));
		
		System.out.println("UpperCase : " + s.toUpperCase());
		
		System.out.println("LowerCase : " + s.toLowerCase());
		
		System.out.println("Without \"Java\" : " + s.substring(0,6) + s.substring(11,14));
	}

}
