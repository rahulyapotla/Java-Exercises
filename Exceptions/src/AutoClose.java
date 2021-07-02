import java.util.ArrayList;
import java.util.List;

public class AutoClose implements AutoCloseable {
	List<Integer> l = new ArrayList<>();
	public void display() {
		System.out.println("implementing autoclose");
		l.add(1);
		l.add(2);
		l.add(3);
		for(int i:l)
			System.out.println(i);
	}
	
	@Override
	public void close() throws Exception {
		l.remove(1);
		System.out.println("Closing resource action");
		for(int i:l)
			System.out.println(i);
	}
}
