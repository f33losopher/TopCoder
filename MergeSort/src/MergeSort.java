import java.util.Arrays;


public class MergeSort {
	  private int[] numbers;
	  private int[] tempMerge;

	  private int length;

	  public void sort(int[] values) {
	    this.numbers = values;
	    length = values.length;
	    this.tempMerge = new int[length];
	    mergesort(0, length - 1);
	    
	    System.out.println("Sorted: " + Arrays.toString(numbers));
	  }

	  private void mergesort(int low, int high) {
	    // check if low is smaller then high, if not then the array is sorted
	    if (low < high) {
	      // Get the index of the element which is in the middle
	      int middle = (low + high) / 2;
	      
	      System.out.println("low: " + low + " middle: " + middle + " high: " + high);
	      // Sort the left side of the array
	      System.out.println(" Merge left low: " + low + " middle: " + middle);
	      mergesort(low, middle);
	      // Sort the right side of the array
	      System.out.println(" Merge right (middle + 1): " + (middle + 1) + " high: " + high);
	      mergesort(middle + 1, high);
	      // Combine them both
	      merge(low, middle, high);
	    }
	  }

	  private void merge(int low, int middle, int high) {

		  System.out.println("  -->MERGE: low: " + low + " middle: " + middle + " high: " + high);
		  
	    // Copy both parts into the helper array
	    for (int i = low; i <= high; i++) {
	      tempMerge[i] = numbers[i];
	    }

	    int left = low;
	    int right = middle + 1;
	    int mergeIdx = low;
	    // Copy the smallest values from either the left or the right side back
	    // to the original array
	    while (left <= middle && right <= high) {
	      if (tempMerge[left] <= tempMerge[right]) {
	        numbers[mergeIdx] = tempMerge[left++];
	      } else {
	        numbers[mergeIdx] = tempMerge[right++];
	      }
	      mergeIdx++;
	    }
	    // Copy the rest of the left side of the array into the target array
	    while (left <= middle) {
	      numbers[mergeIdx++] = tempMerge[left];
	      left++;
	    }

	  }
}
