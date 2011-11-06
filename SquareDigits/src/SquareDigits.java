import java.util.ArrayList;
import java.util.List;


public class SquareDigits {
	private List<Integer> _tList;
	
	public SquareDigits()
	{
		_tList = new ArrayList<Integer>();
	}
	
	public int S(int x)
	{
		int result = 0;
		String s = Integer.toString(x);
		for (char c: s.toCharArray())
		{
			result += Math.pow(c - '0', 2);
		}
		
		return result;
	}
	
	public void T(int x)
	{
		_tList.add(S(x));

		int temp;
		while (true)
		{
			temp = S(_tList.get(_tList.size() - 1));
			if (_tList.contains(temp))
			{
				return;
			}
			else
			{
				_tList.add(temp);
			}
		}
	}
	
	public int smallestResult(int param0)
	{
		int smallestResult = 0;
		
		while (true)
		{
			_tList.clear();
			T(smallestResult);
			
			if (_tList.contains(param0))
			{
				break;
			}
			++smallestResult;
		}
		
		return smallestResult;
	}
}
