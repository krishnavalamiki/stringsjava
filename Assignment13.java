package Strings_javaprograms;

public class Assignment13 {

	public static void main(String[] args) {
		
		//StringBuilder create a instance..
		
		StringBuilder sb = new StringBuilder("");
		sb.append("Sivamma ");
	
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("w/o Nageswarao");
		
		System.out.println(sb);
		
		sb.append(sb1);
		System.out.println(sb); // concat to different Strings..

	}

}
