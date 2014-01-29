import java.util.Comparator;

public class PersonComparer implements Comparator<Person> {
	public PersonComparer() {
		
	}
	
	@Override
	public int compare(Person arg0, Person arg1) {
		if (arg0.getHeight() < arg1.getHeight()) {
			return -1;
		} 
		else if (arg0.getHeight() > arg1.getHeight()) {
			return 1;
		}
		else {
			// Since the heights are equal, lets go by the weight
			if (arg0.getWeight() < arg1.getWeight()) {
				return -1;
			}
			else if (arg0.getWeight() > arg1.getWeight()) {
				return 1;
			}
		}
		
		// Get here only if height and weight are equal
		return 0;
	}

}
