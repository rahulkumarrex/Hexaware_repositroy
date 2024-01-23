package inheritance;

public class Child extends Parent{

    int cid = 99;

    public Child(int cid){
        this.cid = cid;
        System.out.println("Child object created");
    }

    public String toString(){
        return "Child Object Here";
    }
    @Override
    public void m1(){
        System.out.println("m1() from child class");
    }
    public void m2() {
        System.out.println("m2() method is called from Child..");
    }

    public static void main(String[] args) {
//        Child c = new Child(121);
//        System.out.println(c.cid);
        Object o = new Child(123);
//        Parent parent = new Child(102);
        System.out.println(o);

    }
}
