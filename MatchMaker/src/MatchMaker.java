import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MatchMaker {
	private class Member {
		public String _name;
		public char _gender;
		public char _desiredGender;
		public List<Character> _answers = new ArrayList<Character>();

		public int _compareResults = 0;

		public Member(String name, char gender, char desiredGender,
				List<Character> answers) {
			_name = name;
			_gender = gender;
			_desiredGender = desiredGender;
			_answers.addAll(answers);
		}
	}

	private List<Member> _members = new ArrayList<Member>();

	public MatchMaker() {
	}

	String[] getBestMatches(String[] members, String currentUser, int sf) {
		_members.clear();

		parseMembers(members);
		String[] bestMatches = compareAnswers(currentUser, sf);

		return bestMatches;
	}

	private void parseMembers(String[] members) {
		String name;
		char gender;
		char desiredGender;

		for (String memberInfo : members) {
			StringTokenizer st = new StringTokenizer(memberInfo);
			name = st.nextToken();
			gender = st.nextToken().toCharArray()[0];
			desiredGender = st.nextToken().toCharArray()[0];

			List<Character> answers = new ArrayList<Character>();
			while (st.hasMoreTokens()) {
				answers.add(st.nextToken().toCharArray()[0]);
			}

			_members.add(new Member(name, gender, desiredGender, answers));
		}
	}

	private String[] compareAnswers(String currentUser, int sf) {
		List<Member> matches = new ArrayList<Member>();
		Member curMember = findMember(currentUser);
		
		for (Member member : _members) {
			if (curMember != member) {
				int compare = getCompare(curMember, member, sf);

				if (compare >= sf) {
					member._compareResults = compare;
					addToMatches(matches, member);
				}
			}
		}

		String[] goodMatches = new String[matches.size()];
		int i = 0;
		for (Member m : matches) {
			goodMatches[i++] = m._name;
		}

		return goodMatches;
	}
	
	private void addToMatches(List<Member> matches, Member member) {
		for (int i=0; i < matches.size(); i++) {
			if (member._compareResults > matches.get(i)._compareResults) {
				matches.add(i, member);
				return;
			}
		}
		
		matches.add(member);
	}

	private int getCompare(Member curMember, Member compareToMember, int sf) {
		int sameAnswer = 0;
		if (curMember._desiredGender == compareToMember._gender) {
			for (int i = 0; i < curMember._answers.size(); i++) {
				if (curMember._answers.get(i).equals(compareToMember._answers
						.get(i))) {
					sameAnswer++;
				}
			}
		}
		return sameAnswer;
	}

	private Member findMember(String member) {
		for (Member m : _members) {
			if (m._name.equals(member)) {
				return m;
			}
		}
		return null;
	}
}
