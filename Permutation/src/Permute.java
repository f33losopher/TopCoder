
public class Permute {
	public Permute() {
		
	}
	
	public void permute(String string, int begin) {
		if (begin == (string.length() - 1)) {
			System.out.println(string);
		}
		else {
			for (int j = begin; j < string.length(); j++) {
				string = swap(string, begin, j);;
				permute(string, begin+1);
				swap(string, begin, j);
			}
		}
	}
	
	public String swap(String s, int a, int b) {
		char[] chars = s.toCharArray();
		char tmp = chars[a];
		chars[a] = chars[b];
		chars[b] = tmp;
		
		return (new String(chars));
	}

}
