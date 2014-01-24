
public class CountBits {
	public CountBits() {}
	
	int numBits(int x) {
		System.out.print("Oringinal Number: ");
		printBits(x);
		
		int numBits = 0;
		while (x > 0) {
			System.out.println("  ");
			printBits(x);
			System.out.println("  ");
			printBits(x-1); System.out.println();
			
			x &= (x - 1);
			numBits++;
		}
		return numBits;
	}
	
	void printBits(int x) {
		String string = "01";
		String result = "";
		while (x > 0) {
			result = string.charAt(x%2) + result;
			x /= 2;
		}
		System.out.println(result);
	}
}
