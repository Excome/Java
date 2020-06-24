package arrays;
import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [][] nums2 = {{20,150,10}, {95, 40, 800}, {55, 22, 1400}};
		int max = 0;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (max < nums2[i][j]) {
					max = nums2[i][j];
				}
			}
		}
		System.out.println(max);
	}
}
