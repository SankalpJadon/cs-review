/*
 * 2.1-2
 * Rewrite the INSERTION-SORT procedure to sort into nonincreasing instead of nondecreasing
 * order.
 */
public class Ch2_02 {

	public static void main(String[] args) {
		int[] unsortedArray = {4,2,6,1,10,3};
		printArray(decreasingInsertionSort(unsortedArray));

	}
	
	public static int[] decreasingInsertionSort(int[] unsortedArray) {
		if(unsortedArray.length<2) {
			return unsortedArray;
		}
		for(int i=1;i<unsortedArray.length;i++) {
			int selectedElement = unsortedArray[i];
			int j=i-1;
			while(j>=0 && unsortedArray[j]<selectedElement) {
				unsortedArray[j+1] = unsortedArray[j];
				j--;
			}
			unsortedArray[j+1] = selectedElement;
		}
		return unsortedArray;
	}
	
	public static void printArray(int[] input) {
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]);
		}
	}

}
