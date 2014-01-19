
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
		int mask = 0x1 << 31;
		for (int i=0; i < 32; i++) {
			if ((x & mask) == mask) {
				System.out.print(1);
			}
			else {
				System.out.print(0);
			}
			x <<= 1;
		}
	}
}
