package javaAssignment;
import java.util.*;

//Check if the input is pangram or not. (A pangram is a sentence that contains all the
//alphabets from A to Z)
public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine().toLowerCase();
		
		HashSet<Character> uniq = new HashSet<>();
		
		 for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if (ch >= 'a' && ch <= 'z') {
	                uniq.add(ch);
	            }
	     }
		 
		 if(uniq.size()==26) {
			 System.out.println("It is a pangram.");
		 }else {
			 System.out.println("Its is not a pangram.");
		 }
		
	}
}
