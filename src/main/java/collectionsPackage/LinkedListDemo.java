package collectionsPackage;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("abc");
        linkedList.add("def");
        linkedList.add("ghi");
        linkedList.add("123");
        linkedList.add("456");

        String peak = linkedList.peek();
        System.out.println(peak);
        System.out.println(linkedList);


        String poll = linkedList.poll();
        System.out.println(poll);
        System.out.println(linkedList);

        System.out.println(linkedList.size());

        Iterator listIterator = linkedList.iterator();
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
            linkedList.remove(3);
        }

    }

}
