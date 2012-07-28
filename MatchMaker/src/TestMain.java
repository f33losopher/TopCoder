
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] members = {"BETTY F M A A C C",
				 "TOM M F A D C A",
				 "SUE F M D D D D",
				 "ELLEN F M A A C A",
				 "JOE M F A A C A",
				 "ED M F A D D A",
				 "SALLY F M C D A B",
				 "MARGE F M A A C C"};
		
		MatchMaker mm = new MatchMaker();
		String[] best = mm.getBestMatches(members, "MARGE", 4);
		
		for (String b: best) {
			System.out.println(b);
		}

	}

}
