import java.util.Scanner;
import java.util.Set;

public class Helper {
	public static void main(String args[]) {
		Input in = new Input();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter exit to stop");
			String command = sc.nextLine();
			if(command.equals("exit"))
				break;
			
			System.out.println("Enter emp name to register");
			String s = sc.nextLine();
			Employee e = new Employee(s);
			in.readInput(e);
		}
		in.print();
	}
}
