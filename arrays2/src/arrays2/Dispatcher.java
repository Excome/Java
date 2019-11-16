package arrays2;
public class Dispatcher {
	public static void main(String[] args) {
		int [] x = {-3,2,-7,8,9,0,-5,18};
		System.out.print("Изначальнйы массив x: ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		int xsumm = 0;
		System.out.print("Изначальнйы массив x в обратном порядке: ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[x.length-1-i] + " ");
			xsumm = xsumm + x[i];
		}
		System.out.println("\nСумма элементов массива x = " + xsumm);
		int countNeg = 0;
		for (int i=0; i<x.length; i++) {
			if (x[i]<0) {	
				countNeg++;
			}
		}
		int [] xPoz = new int[x.length-countNeg];
		int [] xNeg = new int[countNeg];
		int iPoz = 0;
		int iNeg = 0;
		for (int i =0; i<x.length; i++) {
			if (x[i] < 0) {
				xNeg[iNeg++] = x[i];
			} else {
				xPoz[iPoz++] = x[i];
			}
		}
		System.out.print("Положительный массив x: ");
		for (int i =0; i<xPoz.length; i++) {
			System.out.print(xPoz[i]+" ");
		}
		System.out.println();
		System.out.print("Отрицательный массив x: ");
		for (int i =0; i<xNeg.length; i++) {
			System.out.print(xNeg[i]+" ");
		}
	}
}
