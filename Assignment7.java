package Strings_javaprograms;

public class Assignment7 {

	public static void main(String[] args) {
		// int , char , double , boolean convert into string by value of method..
		int a = 10;
		char c ='k';
		double d  = 3.3333;
		float f = 3.33f;
	    boolean  b  = true;
	    long l = 1277837972;
	    
	    System.out.println("Other data types converts into String data types..");
	    
	    System.out.println(String.valueOf(a)); // int value convert into String value..
	    
	    System.out.println(String.valueOf(b)); // boolean..
	    
	    System.out.println(String.valueOf(c));  // char type..
	    
	    System.out.println(String.valueOf(d));  // double...
	    
	    System.out.println(String.valueOf(f));  // float..
	    
	    System.out.println(String.valueOf(l));  // long..

	}

}
