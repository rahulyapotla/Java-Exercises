
public class Main {
	public static void main(String args[]) throws Exception {
		ExceptionClass e = new ExceptionClass();
		e.checkedException();
		e.tryWithResources();
		try(AutoClose a = new AutoClose()) {
			a.display();
		}
	}
}
