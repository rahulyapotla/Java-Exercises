import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Input3 {
	List<Employee3> aList = new ArrayList<>();
	Set<Employee3> aSet = new HashSet<>();
	
	
	public void readInput() {
		Employee3 e1 = new Employee3();
		e1.setName("emp1");
		aList.add(e1);// both in set and list
		aSet.add(e1);
		
		Employee3 e2 = new Employee3();
		e2.setName("emp2");
		aList.add(e2); // only in list
		
		Employee3 e3 = new Employee3();
		e3.setName("emp3");
		aSet.add(e3); // only in set
		
		Employee3 e4 = new Employee3();
		e4.setName("emp4");
		aList.add(e4);
		aSet.add(e4);
		
	}
	
	public void print() {
		Set<Employee3> convertedSet = new HashSet<>(aList);
		
		Set<Employee3> difference1 = new HashSet<Employee3>(convertedSet);
		difference1.removeAll(aSet);
		for(Employee3 e : difference1)
		System.out.println(e.getName()); // Employees who are in aList and not in aSet
		
		System.out.println("----------");
		
		Set<Employee3> difference2 = new HashSet<Employee3>(convertedSet);
		Set<Employee3> tempSet = new HashSet<Employee3>(aSet);
		tempSet.removeAll(difference2);
		for(Employee3 e : tempSet)
		System.out.println(e.getName()); // Employees who are in  aSet and not in List
		
		System.out.println("----------");
		
		
		Set<Employee3> resultA = new HashSet<>(aSet);
		resultA.retainAll(convertedSet); // Employees both are in aList and aSet
		
		for(Employee3 e : resultA)
			System.out.println(e.getName());
		
		
	}

}
