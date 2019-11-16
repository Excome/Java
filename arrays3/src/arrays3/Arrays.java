package arrays3;
import java.util.Scanner;
public class Arrays {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("¬ведите длину массива: "); int n = in.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 99) + 0;	
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		int max, min, avg;
		max = array[0];
		min = array[0];
		avg = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
			avg = avg + array[i];
		}
		avg = avg/array.length;
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		System.out.println("avg = " + avg);
	}
}
