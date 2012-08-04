import java.util.ArrayList;
import java.util.List;

public class Prerequisites {
	public class ClassAndPrereq {
		public String _course;
		public List<String> _prereqs;

		public ClassAndPrereq(String course) {
			_course = course;
			_prereqs = new ArrayList<String>();
		}
	}

	public List<ClassAndPrereq> _classes;

	public Prerequisites() {
		_classes = new ArrayList<ClassAndPrereq>();
	}

	// String[] orderClasses (String[] classSchedule) {
	//
	// }

	public boolean parseSchedule(String schedule) {
		if (schedule.matches(".*\\s+")) {
			System.out.println("Trailing space");
			return false;
		}
		
		String[] classes = schedule.split(" ");
		ClassAndPrereq classAndPrereq;

		if (classes[0].matches("[A-Z]{3,4}[1-9][0-9]{2}:$")) {
			// Strip off the colon at the end
			classAndPrereq = new ClassAndPrereq(classes[0].substring(0,
					classes[0].indexOf(":")));
		} else {
			return false;
		}

		for (int i = 1; i < classes.length; ++i) {
			if (classes[i].matches("[A-Z]{3,4}[1-9][0-9]{2}")) {
				classAndPrereq._prereqs.add(classes[i]);
			} else {
				return false;
			}
		}
		
		_classes.add(classAndPrereq);

		return true;
	}

}
