
public class Fibonacci {

	public static int printFibonocci(int n) {
		if (n <= 0) {
			return 0;
		}
		
		if (n == 1) {
			return 1;
		}
		
		return (printFibonocci(n-2) + printFibonocci(n-1));
	}
}
