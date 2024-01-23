package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        String name[] = {"Rahul","Tom","Rahul","Priya","Pooja",};

        Stream<String> stream2 = Arrays.stream(name);
        stream2.map((str)->{
            System.out.println(str);return str.length();}).forEach((len)->{
            System.out.println(len);});
        System.out.println("================");
        List list = Arrays.asList(name);
        Stream<String> stream3 = list.stream();
//        stream3.distinct().forEach(System.out::println);
        String str = stream3.reduce((a,b)->{return a+b;}).orElse(String.valueOf(0));
        System.out.println(str);





    }
}
