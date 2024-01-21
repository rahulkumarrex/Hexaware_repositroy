package functionalInterface;

public class ImplementJava7 implements MyInterface{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        MyInterface mi = new ImplementJava7();
        int res = mi.add(5,8);
        System.out.println(res);
    }
}
