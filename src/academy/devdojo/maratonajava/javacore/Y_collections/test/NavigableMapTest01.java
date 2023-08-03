package academy.devdojo.maratonajava.javacore.Y_collections.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letter A");
        map.put("D", "Letter D");
        map.put("B", "Letter B");
        map.put("C", "Letter C");
        map.put("E", "Letter E");

        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println(map.headMap("C", true));
        System.out.println(map.lowerKey("C"));
        System.out.println(map.floorKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.ceilingKey("C"));
    }
}
