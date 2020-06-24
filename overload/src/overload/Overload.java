package overload;
public class Overload {
    public static void main(String[] args) {
        String s = "JAVA FOREVERRRRRRRRRRRRRRRr";
        int l = 0;
        for(int i=0; i < s.length(); i++) {
            l = s.indexOf('F', i);
            if(l != -1) {
                System.out.println(l);
                System.out.println("Testttt");
                i = l;
            } else if (i == s.length()) {
                System.out.println("Совпадений не найдено");
            }
        }
        Something smg = new Something(1,2,3,4);
        System.out.println(smg.getTest1() + " " + smg.getTest2() + " " + smg.test3 + " " + smg.test4);
    }
    
}
