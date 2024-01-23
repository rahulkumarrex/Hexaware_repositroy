package map;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class TreemapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();

        map.put(101,"Raji");
        map.put(107,"tom");
        map.put(103,"hank");
        map.put(108,"andrew");

        System.out.println(map);

    }
}
