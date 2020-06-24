package ifElse;
import java.util.Scanner;
public class Dispetcher {
	public static void main(String[] args) {
		//int x = 10;
		//int y = 20;
		//boolean isGreater = x == y;
		//System.out.println(isGreater);
		Scanner in = new Scanner(System.in);
		System.out.print("Enter how u have cash: ");
		int Cash = in.nextInt();
		System.out.print("Enter how u have card: ");
		int Card = in.nextInt();
		System.out.print("Enter ticket price: ");
		int ticketPrice = in.nextInt();
		boolean haveMoney = (Cash >= ticketPrice) || (Card >= ticketPrice);
		boolean Friends = true;
		if (haveMoney && Friends) {
			System.out.println("Go to cinema. bro!");
		} else {
			System.out.println("Sit at home, bro!");
		}
		int a = in.nextInt();
		a = (a>0) ? 50 : 100;
		System.out.println(a);
	}

}
