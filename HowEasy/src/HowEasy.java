import java.util.StringTokenizer;


public class HowEasy {
	public HowEasy()
	{
		
	}
	
	public int pointVal(String sentence)
	{
		int points = 0;
		int numWords = 0;
		int wordLength = 0;
		
		StringTokenizer st = new StringTokenizer(sentence);
		while (st.hasMoreTokens())
		{
			String token = st.nextToken();
			if (token.matches("[a-zA-Z]+\\.?$"))
			{
				++numWords;
				wordLength += token.length();
				
				if (token.matches(".*\\.$"))
				{
					wordLength -= 1;
				}
			}
		}
		
		if (numWords == 0)
		{
			return 250;
		}
		
		int avg = wordLength / numWords;
		if (avg <= 3)
		{
			points = 250;
		}
		else if (avg == 4 || avg == 5)
		{
			points = 500;
		}
		else
		{
			points = 1000;
		}
		
		return points;
	}
}
