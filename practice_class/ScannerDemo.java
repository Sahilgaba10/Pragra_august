package Practice_class;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerDemo {
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
        int a = scanner.nextInt();

        if(a == 1){
            int sum = x + y;
            System.out.println("The Sum is: " + sum);
        }else if(a == 2){
            int diff = x - y;
            System.out.println("The Difference is: " + diff);
        }else if (a == 3){
            int multiply = x*y;
            System.out.println(" The answer is: " + multiply);
        }else if (a == 4){
            int divide = x/y;
            System.out.println("The division is: " +divide);

        }
    }
}
