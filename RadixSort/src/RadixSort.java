import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {
	List<ArrayList<Integer>> myBuckets = new ArrayList<ArrayList<Integer>>();

	public RadixSort() {
		createBuckets();
	}

	// Assume all numbers have the same number of digits for now
	public void sort(int[] numbers) {
		int divisor = 1;

		for (int i = 0; i < 3; i++) {

			for (int num : numbers) {
				myBuckets.get((num / divisor) % 10).add(num);
			}

			int j = 0;

			for (int k = 0; k < 10; k++) {
				for (int num : myBuckets.get(k)) {
					numbers[j++] = num;
				}
			}

			divisor *= 10;
			createBuckets();
		}

		System.out.println(Arrays.toString(numbers));
	}

	public void createBuckets() {
		for (int i = 0; i < 10; i++) {
			myBuckets.add(i, new ArrayList<Integer>());
		}
	}
}
