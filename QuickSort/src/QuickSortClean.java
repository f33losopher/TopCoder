import java.util.Arrays;


public class QuickSortClean {
	private static int[] theArray;

	private static int arraySize;

	public static void main(String[] args) {

		QuickSortClean theSort = new QuickSortClean(10);

		System.out.println(Arrays.toString(QuickSortClean.theArray));

		theSort.quickSort(0, 9);

		System.out.println(Arrays.toString(QuickSortClean.theArray));

	}

	QuickSortClean(int newArraySize) {
		arraySize = newArraySize;
		theArray = new int[arraySize];
		generateRandomArray();
	}

	public void quickSort(int left, int right) {

		if (right - left <= 0)
			return; // Everything is sorted

		else {

			// It doesn't matter what the pivot is, but it must
			// be a value in the array

			int pivot = theArray[right];

			int pivotLocation = partitionArray(left, right, pivot);

			quickSort(left, pivotLocation - 1); // Sorts the left side

			quickSort(pivotLocation + 1, right);

		}

	}

	public int partitionArray(int left, int right, int pivot) {

		int leftPointer = left - 1;

		int rightPointer = right;

		while (true) {

			while (theArray[++leftPointer] < pivot)
				;

			while (rightPointer > 0 && theArray[--rightPointer] > pivot)
				;

			if (leftPointer >= rightPointer) {
				break;
			}

			else {

				swapValues(leftPointer, rightPointer);
			}

		}

		swapValues(leftPointer, right);
		return leftPointer;

	}

	public void swapValues(int indexOne, int indexTwo) {

		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;

	}

	public void generateRandomArray() {

		for (int i = 0; i < arraySize; i++) {

			// Generate a random array with values between
			// 10 and 59

			theArray[i] = (int) (Math.random() * 50) + 10;

		}

	}
}
