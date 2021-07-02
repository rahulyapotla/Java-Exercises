import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Input2 {
	Set<Employee2> empSet=new TreeSet<Employee2>();
	  
	public void readInput() {
		
		Employee2 e = new Employee2();
		e.setName("Harry");
		e.setSalary(30);
		empSet.add(e);
		
		Employee2 e2 = new Employee2();
		e2.setName("ron");
		e2.setSalary(20);
		empSet.add(e2);
		
		Employee2 e3 = new Employee2();
		e3.setName("john");
		e3.setSalary(20);
		empSet.add(e3);
	}
	
	public void print() {
		 Iterator<Employee2> it= empSet.iterator();
		 while(it.hasNext())
			 System.out.println(it.next().getName());
	}
}
