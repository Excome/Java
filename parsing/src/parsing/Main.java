package parsing;
import java.util.Scanner;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
	    String s = "Something Java test string. Number 2 something Java string test two";
            Pattern p = Pattern.compile(".\\w");
	    Matcher m = p.matcher(s);
//	    while (m.find()){
//            System.out.println(m.start() + " "  + m.end() + " " + m.group());
//        }
	    Scanner sc = new Scanner(s);
	    while(sc.hasNext()){
	        if(sc.hasNext("Java")) {
                System.out.println(sc.next());
            }
	        else if(sc.hasNextInt()) {
                System.out.println(sc.next());
            }
	        sc.next();
        }
    }
}