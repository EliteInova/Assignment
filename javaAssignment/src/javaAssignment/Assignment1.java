package javaAssignment;
import java.util.*;

//Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
public class Assignment1 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        Collections.shuffle(list);
        
        for(int num:list) {
        	System.out.println(num);
        }
	}
}
