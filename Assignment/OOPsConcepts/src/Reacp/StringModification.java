package Reacp;

public class StringModification {
    public static void main(String[] args) {
        String s1 = new String("Hello");

        s1 = s1.concat(" world");
        System.out.println(s1);
        s1 = s1 + " again";
        System.out.println(s1);

    }
}
