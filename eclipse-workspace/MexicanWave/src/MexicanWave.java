
public class MexicanWave {
	public static String[] wave(String str) {
		//String[] Wave = new String[str.length()];
		int l = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {l++;}
		}
		String[] Wave = new String[l];
		l=0;
		StringBuilder str_ = new StringBuilder(str.length());
		for (int i = 0; i < str.length(); i++) {
			str.toLowerCase();
			str_ = new StringBuilder();
			if (str.charAt(i) != ' ') {
				for(int j = 0; j < str.length(); j++) {
					if (j != i) {
						str_.append(str.charAt(j));
					} else {
						str_.append(Character.toUpperCase(str.charAt(j)));
					}
				}
			} else {
				continue;
			}
			Wave[l] = str_.toString();
			System.out.print(Wave[l] + " ");
			l++;
		}
		System.out.println();
		System.out.println(Wave.length);
		return Wave;
    }
	public static void main(String[] args) {
		wave("two words also");
	}

}
