package Strings_javaprograms;

public class Assignement8 {

	public static void main(String[] args) {
		
		
		// String convert reverse..
		
		String s = "Sivamma";
		
		String s1 = "amma";
		
		String org  = s;
		
		String org1 = s1;
		
		int len = s.length();
		
		int len1 = s1.length();
		
		String rev = "";
		
		String Rev = "";
		
	    for(int i = len-1; i>=0; i--) {
	    	rev = rev +s.charAt(i);
	    }
	    System.out.println(rev); // reverse string
	    if(org.equals(rev)) {
	    	System.out.println("s String variable is equal to rev String");
	    }else {
	    	System.out.println("Both Strings not equal to the reverse.");
	    }
	    
	    for(int j = len1-1; j>=0; j--) {
	    	Rev = Rev + s1.charAt(j);
	    }
	    System.out.println(Rev);
        if(org1.equals(Rev)) {
        	System.out.println("It is a palindrome String..");
        } else {
        	System.out.println("not a palindrome number...");
        }
	}

}
