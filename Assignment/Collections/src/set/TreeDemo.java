package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeDemo {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>();

        set.add("F");
        set.add("D");
        set.add("B");
        set.add("G");

        System.out.println(set);
    }
}
