package Strings_javaprograms;

public class Assignment1 {

	public static void main(String[] args) {
	 
		
		// Two types Strings initializes one is variable and instance..
		
		String s = "Sivamma"; // variable type
		
		String S = new String("Nageswarao"); // Instance type...
	   
        System.out.println(S);
        
        System.out.println(s);
        
        //identify the given two strings equal or not.. by using equals method...
        // Expressed boolean..
        
        Boolean result = s.equals(S); 
        System.out.println(result);      // false..
        
        
        // Connects method combine two strings..
        
        String result1 = s.concat(S);
         
        System.out.println(result1);
        
        // concat toString..
        System.out.println(s+S);
	}

}
