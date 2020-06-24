package descriminant;

import java.util.Scanner;

public class Descriminant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("¬ведите переменную a: "); double a = in.nextDouble();
		System.out.print("¬ведите переменную b: "); double b = in.nextDouble();
		System.out.print("¬ведите переменную c: "); double c = in.nextDouble();
		uravnenie(a, b, c);

	}
	
	public static void uravnenie(double a, double b, double c) {
		if (a == 0) {
			double x = c/b;
			System.out.println("x = " + x);
		} else {
			double D = b*b - 4 *a*c;
			if (D > 0) {
				System.out.println("ƒескриминант равен: " + D);
				double x1 = (-b + Math.sqrt(D)) / (2*a);
				System.out.println("x1 = " + x1);
				double x2 = (-b - Math.sqrt(D)) / (2*a);
				System.out.println("x2 = " + x2);
			} else if (D == 0) {
				System.out.println("ƒескриминант равен: " + D);
				double x = (-b) / (2*a);
				System.out.println("x1,2 = " + x);
			} else if (D < 0) {
				System.out.println("”равнение имее мнимые корни");
			}
		}
	}
	
}
