package ru.collectionSet;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        NavigableSet<Integer> treeSet = new TreeSet<Integer>();
        Random rnd = new Random();
        for(int i = 0; i < 10; i++) {
            treeSet.add(rnd.nextInt(21) + 1);
        }
        System.out.println("TreeSet: " + treeSet);

        NavigableSet<unitItem> uITreeSet = new TreeSet<unitItem>();
        for(int i = 0; i < 25; i++) {
            uITreeSet.add(new unitItem(rnd.nextInt(500) + 500));
        }

        System.out.println("uITreeSet: " +  uITreeSet);
        NavigableSet<unitItem> uITreeSet_headSet = uITreeSet.headSet(new unitItem(650), true);
        NavigableSet<unitItem> uITreeSet_subSet = uITreeSet.subSet(new unitItem(650), true, new unitItem(701), false);
        NavigableSet<unitItem> uITreeSet_tailSet = uITreeSet.tailSet(new unitItem(701), true);
        System.out.println("uITreeSet_headSet: " + uITreeSet_headSet);
        System.out.println("uITreeSet_subSet: " + uITreeSet_subSet);
        System.out.println("uITreeSet_tailSet: " + uITreeSet_tailSet);


        System.out.println("\n\nNot Change uITreeSet after itr: " + uITreeSet);
        Iterator<unitItem> itr = uITreeSet.iterator();
        while(itr.hasNext()) {
            unitItem temp = itr.next();
            temp.price += 10;
        }
        System.out.println("   Change uITreeSet before itr: " + uITreeSet);
    }
}
class unitItem  implements Comparable<unitItem>{
    int price;

    public unitItem(int price) {
        this.price = price;
    }

    public String toString() {
        return String.valueOf(price);
    }

    @Override
    public int compareTo(unitItem o) {
        return this.price - o.price;
    }
}
