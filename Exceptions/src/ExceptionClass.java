import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionClass {
	public void checkedException() {
		try {
			int a = 2/0;
			return;
		} catch(ArithmeticException ae) {
			System.out.println(ae);
			return;	
		} finally {
			System.out.println("in finally");
			System.out.println("------");
		}
	}
	
	public void tryWithResources() {
		try (Scanner scanner = new Scanner(new File("sample.txt"))) {
		    while (scanner.hasNext()) {
		        System.out.println(scanner.nextLine());
		    }
		} catch (FileNotFoundException fnfe) {
		    fnfe.printStackTrace();
		    System.out.println("------");
		}
	}
}
