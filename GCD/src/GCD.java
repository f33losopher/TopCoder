public class GCD {
	public GCD() {}
	
	int gcd(int a, int b) {
		if (a == b) return a;
		return gcd(Math.min(a,b), Math.abs(a - b));
	}
	
	int otherGcd(int a, int b) {
		if (b == 0) return a;
		return otherGcd(b, a%b);
	}
	
	int LCM(int a, int b) {
		return (a*b)/gcd(a,b);
	}
}
