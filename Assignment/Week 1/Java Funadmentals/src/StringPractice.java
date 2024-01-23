package strings;

public class StringPractice {

    public static void main(String[] args) {

        String greeting = "Hello, Java Strings!";


        greeting = greeting.concat(" Welcome");
        System.out.println("Concatenated String: " + greeting);


        greeting = greeting + ", I am learning.";
        System.out.println("Final String: " + greeting);


        System.out.println("Original Greeting: " + greeting);

        StringBuilder stringBuilder = new StringBuilder("Java StringBuilder");
        stringBuilder.append(" is powerful.");
        System.out.println("StringBuilder Output: " + stringBuilder.toString());
    }
}
