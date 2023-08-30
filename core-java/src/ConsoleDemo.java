import java.util.Scanner;

public class ConsoleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		
		System.out.print("Enter Name: ");
		String name = console.next();
		System.out.println("Your name: "+ name);
		System.out.print("Enter age: ");
		int age = console.nextInt();
		System.out.println("Your age: "+ age);

	}

}
