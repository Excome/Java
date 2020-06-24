package overload;

public class Something extends Extends {
    int test3;
    int test4;
    Something(int test1, int test2, int test3, int test4) {
        super(test1, test2);
        this.test3 = test3;
        this.test4 = test4;
    }
}
