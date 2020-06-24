package package1;
import package2.*;

public class Dispatcher extends Parent{

	public static void main(String[] args) {
		TestInPackage1 t1 = new TestInPackage1();
//		System.out.println(t1.x1); private
		System.out.println(t1.x2);
		System.out.println(t1.x3);
		System.out.println(t1.x4);
		TestInPackage2 t2 = new TestInPackage2();
//		System.out.println(t2.x1);	private
//		System.out.println(t2.x2);	default
//		System.out.println(t2.x3);	protected
		System.out.println(t2.x4);
		Dispatcher p = new Dispatcher();
//		System.out.println(p.x1);   private
//		System.out.println(p.x2);   default
		System.out.println(p.x3);
		System.out.println(p.x4);
	}

}
