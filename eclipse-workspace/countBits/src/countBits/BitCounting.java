package countBits;

public class BitCounting {
	public static int countBits(int n){
		int cb = 0;
		for (int i = 0; n >= 1; i++) {
			if (n%2 == 1) {cb++;}
			n /= 2;
		}
		return cb;
	}
	public static void main(String[] args) {
		System.out.println(countBits(1234));
	}

}
