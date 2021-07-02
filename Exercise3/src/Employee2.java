
public class Employee2 implements Comparable<Employee2> {
	private String name;
	private int salary;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee2 o) {
		int result = this.getName().compareTo(o.getName());
		//System.out.println(result);
		if(result == 0)
			return Integer.compare(this.getSalary(), o.getSalary());
		else
			return result;
	}
	
}
