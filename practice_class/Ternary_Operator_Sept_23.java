package practice_class;

import java.util.Scanner;

public class Ternary_Operator_Sept_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int number = sc.nextInt();
        System.out.println((number>0)? "Positive" : "Negative");
    }
    }