package abstraction;

import java.util.Scanner;

public abstract class BankImp1 implements IBank{
    @Override

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Deposite Amount: ");
        double amount = sc.nextDouble();
        System.out.println(amount+" Deposite successfully...");
    }
}
