
public class CountBits {
	public CountBits() {}
	
	int numBits(int x) {
		System.out.print("Oringinal Number: ");
		printBits(x);
		
		int numBits = 0;
		while (x > 0) {
			x &= (x - 1);
			numBits++;
		}
		return numBits;
	}
	
	int nextBiggerNumWithSameBits(int x) {
		// Find the next bigger number with the same number of bits
		if (x == 0) {
			return 1;
		}
		
		int new1Bit = 0x1;
		while (true) {
			if ((new1Bit & x) > 0) break;
			new1Bit <<= 1;
		}
		
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
	
	int anotherNextBigNumSameBits(int x) {
		if (x == 0) return 1;
		
		int nextBigNum = 0;
		int lowest1Bit = x & (-x);
		int rightBits = 0;
		
		// Force the first 0 bit after the lowest 1 bit to 1
		nextBigNum = x + lowest1Bit;
		
		// Isolate the right bits and shift them right
		rightBits = x ^ nextBigNum;
		rightBits /= lowest1Bit;
		
		// Correction for doing x + lowest1Bit, account for overflow
		rightBits >>= 2;
			
		return (nextBigNum |= rightBits);	
	}
	
	int nextSmallNumSameBits(int y) {
		printBits(y);
		int t = y + 1;
		printBits(t);
		int u = t ^ y;
		printBits(u);
		int v = t & y;
		printBits(v);
		int x = v - (v & -v)/(u + 1);
		printBits(x);
		
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
	
	boolean powerOf2(int x) {
		if ((x & (x-1)) == 0) {
			return true;
		}
		return false;
	}
}
