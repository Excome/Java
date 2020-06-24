package primeNumber;

public class Prime {

	public static boolean isPrime(int num) {
		boolean IsPrime = true;
		if (num > 1) {
			for (int i = 2; i <= (num / 2); i++) {
				if (num % i == 0) {
					IsPrime = false;
					break;
				}
			}
		} else {IsPrime = false;} 
		return IsPrime;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(21));
		System.out.println(8%2);

	}

}
