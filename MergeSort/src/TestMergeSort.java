
public class TestMergeSort {

	public static void main(String[] args) {
		TestMergeSort tms = new TestMergeSort();
		tms.run();
	}
	
	public void run() {
		MergeSort ms = new MergeSort();
		ms.sort(new int[] {5,3,8,7,7,10,11,6,99,43,83,32,75,36,71});
	}

}
