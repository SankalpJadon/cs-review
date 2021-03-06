//Insertion sort
public class Ch2_01 {
	public static void main(String args[]) {
		int[] inputArray = {4,1,6,8,2,3,10};
		printArray(insertionSort(inputArray));
	}
	
	public static int[] insertionSort(int[] inputArray) {
		if(inputArray.length<2) {
			return inputArray;
		}
		for(int i=1;i<inputArray.length;i++) {
			int selectedNumber = inputArray[i];
			int j=i-1;
			while(j>=0 && inputArray[j]>selectedNumber) {
				inputArray[j+1] = inputArray[j];
				j--;
			}
			inputArray[j+1] = selectedNumber;
		}
		return inputArray;
	}
	
	public static void printArray(int[] input) {
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]);
		}
	}
}
