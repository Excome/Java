package displayName;
import java.util.Scanner;

public class DisplayName {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter ur name: ");
		String UserName = in.nextLine();
		System.out.printf("Hello, %s\n", UserName);
		System.out.print("Input a: ");
		int a = in.nextInt();
		System.out.print("Input b: ");
		int b = in.nextInt();
		System.out.println(a + b);
		System.out.println("summa = " + a+b);
		System.out.println("Summa = " + (a + b));
		if (a==b) {
			System.out.println("4isla odinakovie");
		} 
		else {
			System.out.println("4isla ne odinakovie");
		}
		for (int i=0; i<5;i++) {
			System.out.println("Ha ha ha");
		}
	}

}