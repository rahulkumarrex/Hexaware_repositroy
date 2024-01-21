package Reacp;

public class StringsDemo {
    public static void main(String[] args) {

        StringsDemo d1 = new StringsDemo();
        StringsDemo d2 = new StringsDemo();

        System.out.println(d1.equals(d2));

        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        String s3 = "Rahul";
        String s4 = "Rahul";

        System.out.println(s3.equals(s4));
        System.out.print("Hashcode: ");
        System.out.println(s3 == s4);


    }
}
