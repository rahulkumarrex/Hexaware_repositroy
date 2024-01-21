package map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();

        map.put(101,"rahul");
        map.put(103,"ram");
        map.put(102,"pooja");
        map.put(102,"priya");

        Set<Integer> set = map.keySet();
        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            Integer k = it.next();
            System.out.println(k+" "+map.get(k));
        }

        Collection<String> list = map.values();

        for(String i: map.values()){
            System.out.println(i);
        }

    }
}
