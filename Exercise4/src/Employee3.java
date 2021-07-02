
public class Employee3 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee3 e = (Employee3) obj;
		return e.name.equals(this.name);
	}
}
