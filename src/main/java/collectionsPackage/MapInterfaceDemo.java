package collectionsPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterfaceDemo {

    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("key1","value1");
        hashMap.put("key2","value2");
        hashMap.put("key3","value3");
        hashMap.put("key4","value4");
        hashMap.put("key2","value5");

        System.out.println(hashMap.get("key2"));

        for (Map.Entry<String, String> entry:hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        HashMap<String,Integer> integerHashMap = new HashMap<>();
        integerHashMap.put("key1",1);
        integerHashMap.put("key2",1);
        integerHashMap.put("key3",1);
        integerHashMap.put("key4",1);
//        integerHashMap.remove("key4");

        for (Map.Entry<String, Integer> entry:integerHashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(integerHashMap.containsKey("key1"));
        System.out.println(integerHashMap.containsKey("key10"));
        System.out.println(integerHashMap.containsValue(1));

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");

        Set<Integer> set = hmap.keySet();
        for(Integer s:set) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> entry:hmap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        /*Adding elements to HashMap*/
        treeMap.put(12, "Chaitanya");
        treeMap.put(2, "Rahul");
        treeMap.put(7, "Singh");
        treeMap.put(49, "Ajeet");
        treeMap.put(3, "Anuj");

        for (Map.Entry<Integer, String> entry:treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        /*String a = "hello";
        HashMap<Character,Integer> countMap = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if(countMap.containsKey(ch)) {
                int count = countMap.get(ch);
                count++;
                countMap.put(ch,count);
            } else {
                countMap.put(ch,1);
            }
        }
        for (Map.Entry<Character, Integer> entry:countMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }*/
    }
}
