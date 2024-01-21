package abstraction;

import java.util.Scanner;

public class BankImp2 extends BankImp1{

    @Override
    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Withdraw Amount: ");
        double amount = sc.nextDouble();
        System.out.println(amount+" Withdraw Successfully...");
    }
}
