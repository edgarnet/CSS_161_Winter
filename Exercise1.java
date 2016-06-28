//CSS 161
//  Skeleton file for use with basic array algorithms, such as: 
//  contains, indexOf, count and duplicates.
//
//  Skeleton Level: Strong. 
//		You only need to fill in existing functions 
//		below to complete this driver, with no changes to main.
//
import java.util.Arrays;

public class Exercise1 {

	//Notice that in this main, each of the functions have been called for you
	public static void main(String[] args) {
		int[] data = {1,3,5,4,7,9,1,3};
		int[] output = new int[data.length];
		
		System.out.println("Does our array contain a '1':"+contains(data, 1)); 	//true
		System.out.println("Does our array contain a '0':"+contains(data, 0)); 	//false
		System.out.println("What is the index of '4'? " + indexOf(data, 4)); 	//3
		System.out.println("The number of occurrences of '1'? " + count(data, 1)); 	//2
		
		duplicates(data, output);
		System.out.println("After removing duplicates from data:");
		System.out.println(Arrays.toString(output));
	}
	public static boolean contains(int[] input, int target) {
		//todo: see lab
		
		return false;
	}
	public static int indexOf(int[] input, int target) {
		//todo: only find the indexOf a target if we contain() it
		return -1;
	}
	public static int count(int[] input, int target){
		int retVal = 0;
		//todo: only try to count a number that we contain()
		
		return retVal;
	}
	public static void duplicates(int[] input, int[] output) {
		//todo: Transfer items once from the arrays:input and output.
		//Transfer items from input to the output array IF:  
		//	only if newArray.count(target) == 0 //ie, we haven't put this in yet
		//	only if newArray.indexOf(target) == -1 //not found in newArray, or
		//	only if newArray.contains(target) == false //does not exist in the new array
	}
}