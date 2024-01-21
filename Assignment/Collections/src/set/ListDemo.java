package set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList<Number> list = new LinkedList<Number>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        for (Number n: list){
            System.out.println(n);
        }
    }
}
