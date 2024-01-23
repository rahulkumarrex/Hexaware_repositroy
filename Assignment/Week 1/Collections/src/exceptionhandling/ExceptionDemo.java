package exceptionhandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Open File");
        System.out.println("Read Data from file");
        int res = 0;
        try {
            res = div(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Sorry");
        }
        System.out.println("Result: " + res);
        System.out.println("Close File");

    }

    public static int div(int a,int b){
        return a/b;
    }
}
