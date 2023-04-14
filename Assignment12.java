package Strings_javaprograms;

import java.util.StringJoiner;

public class Assignment12 {

	public static void main(String[] args) {
		
		// String joiner instance it will be perform sum operation 
         StringJoiner sj = new StringJoiner("");
         
         sj.add("krishna ");
         sj.add("valmiki ");
         System.out.println(sj);
         
         StringJoiner sj1 = new StringJoiner("");
         sj1.add("s/o Nageswarao valmiki");
         
         sj.merge(sj1);                           // concat two different Strings by using merge method..
         
         System.out.println(sj);  
  
	}

}
