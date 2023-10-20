package practice_class;

import java.util.Scanner;

public class problemSolving1 {

    int max =100;
    int sum;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        problemSolving1 s1= new problemSolving1();
        System.out.println("Enter Marks of English: ");
        s1.sum = scanner.nextInt();
        problemSolving1 s2= new problemSolving1();
        System.out.println("Enter Marks of Maths: ");
        s2. sum = scanner.nextInt();
        problemSolving1 s3= new problemSolving1();
        System.out.println("Enter Marks of Hindi: ");
        s3.sum = scanner.nextInt();
        problemSolving1 s4= new problemSolving1();
        System.out.println("Enter Marks of Science: ");
        s4.sum = scanner.nextInt();
        problemSolving1 s5= new problemSolving1();
        System.out.println("Enter Marks of Computer: ");
        s5.sum = scanner.nextInt();
        int total = s1.sum + s2.sum + s3.sum + s4.sum + s5.sum;
        int percent = ((total*100)/500);
        System.out.println("Your total percent is:  "+ percent);

    }
}
