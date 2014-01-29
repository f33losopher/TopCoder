import java.util.Comparator;


public class Person {
	private int myWeight;
	private int myHeight;
	
	public Person(int height, int weight) {
		this.myWeight = weight;
		this.myHeight = height;
	}
	
	public int getWeight() {
		return myWeight;
	}
	
	public int getHeight() {
		return myHeight;
	}
}
