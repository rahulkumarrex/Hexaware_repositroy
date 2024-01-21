package thread;

public class Admission implements Runnable {
    int seats = 2;

    public static void main(String[] args) {
        Runnable ad = new Admission();
        Thread t1 = new Thread(ad,"Sarthak");
        Thread t2 = new Thread(ad,"Raju");
        t1.start();
        t2.start();

        System.out.println(t1);
        System.out.println(t2);

    }

    @Override
    public void run() {
        System.out.println("No. of Seats: "+seats);
        if(seats>0){

            System.out.println("Seat allocated to "+Thread.currentThread().getName());
            seats = seats -1;
        }
        System.out.println("No. of Seats left after "+seats);

    }
}
