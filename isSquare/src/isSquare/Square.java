package isSquare;
public class Square {
	public static boolean isSquare(int n) {        
		boolean IsSquare;
		double a = Math.sqrt(n);
		double b = a - (int)a;
		if (b == 0.00) {
			IsSquare = true;
		} else {
			IsSquare = false;
		}
		return IsSquare;
    }
	
	public static void main(String[] args) {
		System.out.println(isSquare(2));
	}
}
