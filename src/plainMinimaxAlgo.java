/*
** It is the driver class.
**/

import java.lang.*;
public class plainMinimaxAlgo {
	
	public static void main(String[] args) {
		miniMax m = new miniMax();
		int[] leaves = {1,3,4,5,6,7,8,10};
		int numberOfLeaves = leaves.length;
		int indexOfElement = 0;
		Double height = Math.log10(numberOfLeaves)/Math.log10(2);
		int min = m.miniMaxMethod(height, 0, indexOfElement, leaves, true);
		System.out.println("Minimum value is "+min);

	}
	

}
