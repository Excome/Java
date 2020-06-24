package exceptions;

public class Main {

    public static void main(String[] args) {
	    int x = 10;
	    int y = 0;
	    try {
			System.out.println(y / x);
		}
	    catch(RuntimeException ex)  {
	    	System.out.println(ex);
		}
    }
}
