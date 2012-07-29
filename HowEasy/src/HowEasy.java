
public class HowEasy {

	public HowEasy() {
	}

	public int pointVal(String problemStatement) {
		int numWords = 0;
		int lengthOfWords = 0;

		String[] words = problemStatement.split(" ");
		for (String word: words) {
			if (isWord(word)) {
				++numWords;
				lengthOfWords += word.length();
				if (word.contains(".")) {
					-- lengthOfWords;
				}
			}
		}

		return calcPoints(lengthOfWords, numWords);
	}

	public int calcPoints(int lengthOfWords, int numWords) {
		if (numWords <= 0)
			return 250;

		int avg = lengthOfWords / numWords;
		if (avg <= 3) {
			return 250;
		} else if (avg >= 6) {
			return 1000;
		} else {
			return 500;
		}
	}

	public boolean isWord(String token) {
		if (token.matches("[a-zA-z]+\\.?")) {
			return true;
		}
		return false;
	}
}
