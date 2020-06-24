public class TwoToOne {

	public static String longest (String s1, String s2) {
		String abc = "abcdefghijklmnopqrstuvwxyz";
		String str = s1.concat(s2);
		char[] strArray = str.toCharArray();
		char[] abcArray = abc.toCharArray();
		int d=0;
		for (int i = 0; i < abc.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (abcArray[i] == strArray[j]) {
					d++;
					break;
				}
			}
		}
		String[] TwoToOne = new String[d];
		int k = 0;
		for (int i = 0; i < abc.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (abcArray[i] == strArray[j]) {
					TwoToOne[k] = String.valueOf(abcArray[i]);
					k++;
					break;
				}
			}
		}
		for (int i=0; i < TwoToOne.length; i++) {
			System.out.print(TwoToOne[i]);
		}
		System.out.println();
		StringBuilder sb = new StringBuilder(TwoToOne.length);
		for (String current : TwoToOne) {
		    sb.append(current);
		}
		String cans = sb.toString();
		return cans;
	}
	public static void main(String[] args) {
		String a = "xyaabbbccccdefww";
		String b = "xxxxyyyyabklmopq";
		longest(a, b);
		a = "abcdefghijklmnopqrstuvwxyz";
		longest(a, a);

	}
}
