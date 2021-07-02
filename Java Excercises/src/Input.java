import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Input {
	//Set<String> empSet = new HashSet<String>();
	List<Employee> empList = new ArrayList<Employee>();
	public void readInput(Employee emp) {
		if(!empList.contains(emp)) {
			empList.add(emp);
		}
	}
	
	public void print() {
		for(Employee e : empList) {
			System.out.println(e.name);
		}
	}
}
