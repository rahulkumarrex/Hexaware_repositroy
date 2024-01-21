
class Student{
    int studentId;
    String name;
    double marks;

    public Student() {

    }

    public Student(int studentId,String name,double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public static void saySomething() {
        System.out.println("Hello");
    }
}
public class Basics {


    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(2, "Aman", 80);
        Student s3 = new Student(3, "Rahul", 70);
        s1.studentId = 1;
        s1.name = "Priya";
        s1.marks = 70.50;

        Student.saySomething();

        System.out.println(s1.studentId);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        System.out.println(s2.studentId);
        System.out.println(s2.name);
        System.out.println(s2.marks);

        System.out.println(s3.studentId);
        System.out.println(s3.name);
        System.out.println(s3.marks);




    }

}