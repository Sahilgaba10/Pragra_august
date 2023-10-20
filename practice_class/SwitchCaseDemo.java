package practice_class;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first input");
        int x = scanner.nextInt();

        System.out.println("Enter your second input");
        int y = scanner.nextInt();

        System.out.println(" Addition   :1");
        System.out.println(" Subtraction   :2");
        System.out.println(" Multiplication   :3");
        System.out.println("  Divide  :4");

        System.out.println("Enter your input");
        int input = scanner.nextInt();

        switch (input){
            case 1:
                System.out.println("case1");
                break;
            case 2:
                System.out.println("case2");
                break;
            case 3:
                System.out.println("case3");
                break;
        }
    }
}
