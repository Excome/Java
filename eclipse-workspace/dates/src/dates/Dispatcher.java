package dates;
import java.util.*;
public class Dispatcher {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));
		gc.set(Calendar.MONTH,Calendar.JULY);
		gc.set(Calendar.DAY_OF_MONTH, 6);
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));
	}

}
