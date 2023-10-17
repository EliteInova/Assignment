package javaAssignment;
import java.util.*;

//Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String roman=sc.nextLine().toUpperCase();
		int decimal=converter(roman);
		System.out.println(roman+" = "+decimal);
	}
	
	public static int converter(String roman) {

        HashMap<Character, Integer> romanNum = new HashMap<>();
        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);
        
        int decimal = 0;
        int prev = 0;
        
        for (int i = roman.length() - 1; i >= 0; i--) {
            char currChar = roman.charAt(i);
            int currValue = romanNum.get(currChar);
            
            if (currValue < prev) {
                decimal -= currValue;
            } else {
                decimal += currValue;
            }
            
            prev = currValue;
        } 
        return decimal;
    }
}
