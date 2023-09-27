package Practice_class;

import java.util.Scanner;

public class RogersIVR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome to Rogers helpdesk");
        System.out.println("Press 1 for : English");
        System.out.println("Press 2 for : Internet");
        System.out.println("Press 3 for : New Customer");
        System.out.println("Press 4 for : billing inquiry");
        System.out.println("Press 5 for : upgrade");

        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("English is selected");
                break;
            case 2:
                System.out.println("Press1 for : Troublrshhoting");
                System.out.println("Press2 for : New Connection");
                System.out.println("Press3 for : Talk With Customer Representative");


                int solutioninput = scanner.nextInt();
                if (solutioninput == 2) {
                    System.out.println("you have selected new connection");
                } else if (solutioninput == 1) {
                    System.out.println("you have selected Troubleshhoting");
                } else if (solutioninput == 3) {
                    System.out.println("You have selected Talk with Customer Representative");


                }

        }
    }
}