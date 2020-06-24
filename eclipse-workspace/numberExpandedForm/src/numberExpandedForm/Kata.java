package numberExpandedForm;

public class Kata {

	public static String expendedForm(int num) {
		String Exp = "";
		String numS = String.valueOf(num);
		char[] numArray = numS.toCharArray();
		for (int i = 0; i < numS.length(); i++) {
			if (numArray[i] != '0') {
				Exp += numS.charAt(i);
				for (int j = 0; j < (numS.length()-i-1); j++) {
					Exp += "0";
				}
			}
			if ((i != numS.length()-1) && (numArray[i+1] != '0')) {
				Exp += " + ";
			}
		}
		return Exp;
	}
	public static void main(String[] args) {
		System.out.println(expendedForm(70123));

	}

}
