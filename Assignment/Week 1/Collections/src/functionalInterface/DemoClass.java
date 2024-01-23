package functionalInterface;

public class DemoClass {
    public static void main(String[] args) {
        MyInterface mi = (int a,int b)->{return a+b;};
        int res = mi.add(4,7);
        System.out.println(res);

    }
}
