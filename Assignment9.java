package Strings_javaprograms;

public class Assignment9 {

	public static void main(String[] args) {
	
		
		// Given a String palindrome or not
		
		String s  = "amma"; // malayalam , madam , 12321 ,abcba these are the palindromes.
		
		String org = s;
		
		int len = s.length();
		
		String rev = "";
		
		for(int i = len-1; i>=0; i--) {
            rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		if(org.equals(rev)) {
			System.out.println("It is a palindrome String..");
		} else {
			System.out.println("It is not a palindrome String..");
		}

}
}
