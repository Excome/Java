package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
//        System.out.println(al.size());
        al.add(5);
        al.add("Maxim");
        al.add(new Car("Audi"));
        al.add(new Dog("Tax"));
        System.out.println(al.size());
        System.out.println(al);
        System.out.println(al.contains("Maxim"));
        ArrayList<String> list = new ArrayList();
//        System.out.println(list.size());
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        String[] s = {"test5", "test6", "test7", "test8"};
        for(String temp : s) {
            list.add(temp);
        }
        System.out.println(list.size());
        System.out.println(list);
        s = new String[list.size()];
        list.toArray(s);
        for(String temp : s) {
            System.out.print(temp + " ");
        }
        list = new ArrayList(Arrays.asList(s));
        System.out.println();
        System.out.println(list);


    }
}
