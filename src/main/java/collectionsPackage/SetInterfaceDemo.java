package collectionsPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceDemo {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Grapes");
        hashSet.add("Orange");
        hashSet.add("Fig");

        System.out.println(hashSet);

        hashSet.remove("Apple");

        for(String s:hashSet) {
            System.out.println(s);
        }

        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Grapes");
        treeSet.add("Orange");
        treeSet.add("Fig");

        System.out.println(treeSet);

        Iterator<String> treeSetIterator = treeSet.descendingIterator();
        while(treeSetIterator.hasNext()) {
            System.out.println(treeSetIterator.next());
        }
    }
}
