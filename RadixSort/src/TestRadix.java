
public class TestRadix {

	public static void main(String[] args) {
		TestRadix tr = new TestRadix();
		tr.run();

	}
	
	public void run() {
		RadixSort rs = new RadixSort();
		rs.sort(new int [] {233, 105, 555, 270, 103, 999, 850});
		rs.sort(new int [] {233, 105, 555, 270, 103, 999, 850, 101, 202, 100, 501, 903, 795});
	}

}
