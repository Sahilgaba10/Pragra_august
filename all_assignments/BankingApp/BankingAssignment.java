package all_assignments;

import javax.swing.*;
import java.util.Scanner;

public class BankingAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        int depositNumber = 0;
        int withdrawalNumber = 0;
        int depositAmount= 0;
        int withdrawalAmount= 0;
        int choice;
        System.out.println("Welcome To Your Banking App");
        System.out.println("Press 1 for: Check Your Balance");
        System.out.println("Press 2 for: Make A Deposit");
        System.out.println("Press 3 for: Make A Withdraw");
        System.out.println("Press 4 for: Account Summary");
        System.out.println("Press 5 for: Exit");

        do{
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Your Total Balance is");
                    System.out.println("$" +balance);
                    break;
                case 2:
                    System.out.print("Enter Your Deposit Amount: ");
                    int Amount= scanner.nextInt();
                    depositAmount+= Amount;
                    depositNumber++;
                    balance+= Amount;
                    System.out.println("Deposit Successful!");
                    break;
                case 3:
                    System.out.print("Enter Your Withdrawal Amount: ");
                    int withdraw= scanner.nextInt();
                    withdrawalAmount+=withdraw;
                    withdrawalNumber++;
                    if (withdraw<=balance){
                        balance-=withdraw;
                        System.out.println("Withdrawal successful!");
                    }else {
                        System.out.println("insufficient Funds");
                    }
                    break;
                case 4:
                    System.out.println("Your Account Summary");
                    System.out.println("Total Balance: " +balance);
                    System.out.println("Total Number of Deposit Made: " +depositNumber);
                    System.out.println("Total Amount of Deposit Made: " +depositAmount);
                    System.out.println("Total Number of Withdrawal Made: " +withdrawalNumber);
                    System.out.println("Total Amount of Withdrawal Made: " +withdrawalAmount);
                    break;
                case 5:
                    System.out.println("Thanks For Using This Service.");
                    break;
                default:
                    System.out.println("This Choice Is Invalid");
            }
        }while (choice !=5);

    }
}