package exceptionhandling;

public class Bank {

    public static void main(String[] args) {
        int acon[] = {101,102,103,104};
        String names[] = {"tom","ravi","rahul","priya"};
        double balance[] = {2000,3000,5000,7000};

        System.out.println("Acon   Name   Balance");
        for(int i=0;i<acon.length;i++){
            System.out.println(acon[i]+"   "+names[i]+"    "+balance[i]);

            if(balance[i]<1000) {
                try {
                   throw new LowBalanceException();
                }catch (LowBalanceException e){
                    System.err.println("Balance Low");
                }
            }

        }
    }
}
