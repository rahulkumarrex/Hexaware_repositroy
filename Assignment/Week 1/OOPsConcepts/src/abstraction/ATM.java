package abstraction;

import java.util.Scanner;

public class ATM {


    public static void main(String[] args) {
        IBank bank = new BankImp2();
        System.out.println("***WELCOME TO ATM***");
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("Enter 1 for Withdraw: ");
            System.out.println("Enter 2 for Deposite: ");
            System.out.println("Enter 3 for Exit: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bank.withdraw();
                    break;
                case 2:
                    bank.deposit();
                    break;
                case 3:
                    flag = false;
                    System.out.println("Thank You Visit Again");
                    break;
            }
        }

    }
}
