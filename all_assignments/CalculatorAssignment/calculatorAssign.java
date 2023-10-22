package all_assignments;

import java.util.Scanner;

public class calculatorAssign {
    public static void main(String[] args) {
        mainAssign object = new mainAssign();
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Welcome to calculator");
            System.out.println("Main Menu");

            System.out.println("------------------");
            System.out.println("Press 1 for: Addition ");
            System.out.println("Press 2 for: Subtraction");
            System.out.println("Press 3 for: Multiplication");
            System.out.println("Press 4 for: Division");
            System.out.println("Press 5 for: Exit");
            menu = scanner.nextInt();
            switch (menu) {

                case 1 :
                    int option1;

                    do {
                        System.out.println("Welcome to Addition");
                        System.out.println("Press 1 for: Addition of Two numbers");
                        System.out.println("Press 2 for: Addition of Three numbers");
                        System.out.println("Press 3 for: Exit to Main menu");

                        option1 = scanner.nextInt();
                        if (option1 == 1) {
                            int input;
                            do {
                                System.out.println("Let's Perform Addition of Two numbers");
                                System.out.println("Enter Your First number");
                                int num1 = scanner.nextInt();
                                System.out.println("Enter Your Second number");
                                int num2 = scanner.nextInt();
                                int sum = object.add(num1, num2);
                                System.out.println("SumTotal: " + sum);
                                System.out.println("Press 1  to continue OR Press 2 to go back");
                                input = scanner.nextInt();

                            } while (input != 2);

                        } else if (option1 == 2) {
                            int input2;
                            do {
                                System.out.println("Let's Perform Addition of Three numbers");
                                System.out.println("Enter Your First number");
                                int add1 = scanner.nextInt();
                                System.out.println("Enter Your Second number");
                                int add2 = scanner.nextInt();
                                System.out.println("Enter Your Third number");
                                int add3 = scanner.nextInt();
                                int addit = object.add1(add1, add2, add3);
                                System.out.println("SumTotal: " + addit);
                                System.out.println("Press 1  to continue OR Press 2 to go back");
                                input2 = scanner.nextInt();
                            } while (input2 != 2);
                        }
                    }while (option1 !=3);
                    break;
                case 2:
                    int option2;
                    do {
                        System.out.println("Welcome to Subtraction");
                        System.out.println("Press 1 for: Subtraction of Two numbers");
                        System.out.println("Press 2 for: Subtractiom of Three numbers");
                        System.out.println("Press 3 for: Exit to Main menu");

                        option2 = scanner.nextInt();
                        if (option2 == 1) {
                            int input3;
                            do {
                                System.out.println("Let's Perform Subtraction of Two numbers");
                                System.out.println("Enter Your First number");
                                int sub = scanner.nextInt();
                                System.out.println("Enter Your Second number");
                                int sub2 = scanner.nextInt();
                                int minus = object.sub(sub, sub2);
                                System.out.println("Answer: " + minus);
                                System.out.println("Press 1  to continue OR Press 2 to go back to Main Menu ");
                                input3 = scanner.nextInt();
                            } while (input3 != 2);

                        } else if (option2 == 2) {
                            int input4;
                            do {
                                System.out.println("Let's Perform Subtraction of Three numbers");
                                System.out.println("Enter Your First number");
                                int subtract = scanner.nextInt();
                                System.out.println("Enter Your Second number");
                                int subtract2 = scanner.nextInt();
                                System.out.println("Enter Your Third number");
                                int subtract3 = scanner.nextInt();
                                int subtraction1 = object.sub1(subtract, subtract2, subtract3);
                                System.out.println("Answer: " + subtraction1);
                                System.out.println("Press 1  to continue OR Press 2 to go back to Main Menu ");
                                input4 = scanner.nextInt();
                            } while (input4 != 2);
                        }
                    }while (option2 !=3);
                        break;

                case 3:
                    int option3;
                    do {
                        System.out.println("Welcome to Multiplication");
                        System.out.println("Press 1 for: Multiplication of Two numbers");
                        System.out.println("Press 2 for: Multiplication of Three numbers");
                        System.out.println("Press 3 for Exit to Main menu");

                        option3 = scanner.nextInt();
                        if (option3 == 1) {
                            int input5;
                            do {
                                System.out.println("Let's Perform Multiplication of Two numbers");
                                System.out.println("Enter Your First number");
                                int mult = scanner.nextInt();
                                System.out.println("Enter Your Second number");
                                int mult2 = scanner.nextInt();
                                int multii = object.multi(mult, mult2);
                                System.out.println("Result: " + multii);
                                System.out.println("Press 1  to continue OR Press 2 to go back to Main Menu");
                                input5 = scanner.nextInt();
                            } while (input5 != 2);

                        } else if (option3 == 2) {
                            int input6;
                            do {
                                System.out.println("Let's Perform Multiplication of Three numbers");
                                System.out.println("Enter Your First number");
                                int multi = scanner.nextInt();
                                System.out.println("Enter Your Second number");
                                int multi2 = scanner.nextInt();
                                System.out.println("Enter Your Third number");
                                int multi3 = scanner.nextInt();
                                int multiply = object.multi1(multi, multi2, multi3);
                                System.out.println("Result: " + multiply);
                                System.out.println("Press 1  to continue OR Press 2 to go back to Main Menu");
                                input6 = scanner.nextInt();
                            } while (input6 != 2);

                        }
                    }while (option3 !=3);
                    break;

                case 4:
                    int option4;
                    do {
                        System.out.println("Welcome to Division");
                        System.out.println("Press 1 for: Division of Two numbers");
                        System.out.println("Press 2 for: Division of Three numbers");
                        System.out.println("Press 3 for: Exit to Main Menu");

                        option4 = scanner.nextInt();
                        if (option4 == 1) {
                            int input7;
                            do {
                                System.out.println("Let's Perform Division of Two numbers");
                                System.out.println("Enter Your First number");
                                int divide1 = scanner.nextInt();
                                System.out.println("Enter Your Second number");
                                int divide2 = scanner.nextInt();
                                int div = object.div(divide1, divide2);
                                System.out.println("Answer: " + div);
                                System.out.println("Press 1  to continue OR Press 2 to go back to Main Menu");
                                input7 = scanner.nextInt();
                            } while (input7 != 2);

                        } else if (option4 == 2) {
                            int input8;
                            do {
                                System.out.println("Let's Perform Division of Three numbers");
                                System.out.println("Enter Your First number");
                                int div1 = scanner.nextInt();
                                System.out.println("Enter Your Second number");
                                int div2 = scanner.nextInt();
                                System.out.println("Enter Your Third number");
                                int div3 = scanner.nextInt();
                                int div = object.div1(div1, div2, div3);
                                System.out.println("Answer: " + div);
                                System.out.println("Press 1  to continue OR Press 2 to go back to Main Menu");
                                input8 = scanner.nextInt();
                            } while (input8 != 2);

                        }
                    }while (option4 !=3);
                        break;
                    }
            }while (menu != 5);
        System.out.println("Thankyou for using Calculator");
        }
    }