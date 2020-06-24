package stringorder;
public class StringOrder {
    public static void main(String[] args) {
        order("abc2 abc1 abc4   abc3       abc5");
    }
    public static String order(String words) {
        int n_words = words.split(" +").length;
        System.out.println(n_words);
        String new_words="";
        String[] m_words = new String[n_words];
        String ch;
        for (String retval : words.split(" +")) {
            for(int j = 1; j <= 9; j++) {
                ch = String.valueOf(j);
                if(retval.contains(ch) == true) {
                    m_words[j] = retval;
                    break;
                }
            }
        }
        for(int i = 0; i < n_words; i++) {
            System.out.println(m_words[i]);
        }
    return new_words;
  }
}
