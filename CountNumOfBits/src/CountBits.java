
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
	
	int nextBiggerNumWithSameBits(int x) {
		// Find the next bigger number with the same number of bits
		// There are 2 cases:
		// 1: the lowest 1 bit is alone, simply shift it left
		// 2: the lowest 1 bit has 1 or more 1 bits to its left. Take the most
		//    left bit and shift it over by 1, take all the remaining bits and
		//    shift them to the right
		if (x == 0) {
			return 1;
		}
		
		int new1Bit = 0x1;
		while (true) {
			if ((new1Bit & x) > 0) break;
			new1Bit <<= 1;
		}
		
		// CASE: 1
		if (((new1Bit << 1) & x) == 0) {
			new1Bit <<= 1;;
			x &= ~(new1Bit -1);
			x |= new1Bit;
			return x;
		}
		
		// CASE: 2
		int num1Bits=1;
		new1Bit <<= 1;
		while (true) {
			if ((new1Bit & x) == 0) break;
			new1Bit <<= 1;
			num1Bits++;
		}

		x &= ~(new1Bit - 1);
		x |= (new1Bit);
		x |= (int) (Math.pow(2, (num1Bits-1)) - 1);

		return x;
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
