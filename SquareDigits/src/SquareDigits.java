import java.util.ArrayList;
import java.util.List;

public class SquareDigits {
	final int DIVISOR = 10;
	List<Integer> _squaredDigits;
	
	public SquareDigits() {
		_squaredDigits = new ArrayList<Integer>();
	}
	
	public List<Integer> getSquaredDigits() {
		return _squaredDigits;
	}
	
	public int smallestResult(int n) {
		int x = 0;
		while (true) {
			T(x);
			if (_squaredDigits.contains(n)) {
				break;
			}
			++x;
		}
	
		return x;
	}
	
	// TODO Change to private. Public for J-Unit testing
	public int S(int x) {
		if (x < DIVISOR) {
			return (int) Math.pow(x, 2);
		}
		return (int) (S(x / DIVISOR) + Math.pow((x % DIVISOR),2));
	}
	
	// TODO Change to private. Public for J-Unit testing
	public void T(int x) {
		_squaredDigits.clear();
		
		int squared = S(x);
		while (!_squaredDigits.contains(squared)) {
			_squaredDigits.add(squared);
			squared = S(squared);
		}
	}
}
