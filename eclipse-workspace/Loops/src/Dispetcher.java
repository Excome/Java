
public class Dispetcher {

	public static void main(String[] args) {
		int i, j;
		for (i=0; i<10; i++) {
			for (int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for (j=10-i; j>0; j--) {
				System.out.print(".");
			}
			System.out.println();
		}
	}

}
