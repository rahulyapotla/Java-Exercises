
public class Employee {
	public String name;

	Employee(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Employee e = (Employee) obj;
		
		return this.name.equals(e.name);
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}

