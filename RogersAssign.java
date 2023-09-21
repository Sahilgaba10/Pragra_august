import java.util.Scanner;

public class RogersAssign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rogers Customer Service");
        System.out.println("Press 1 for : English");

        int english = scanner.nextInt();
        switch (english){
            case 1:
                System.out.println("English is Selected");

            case 2:
                System.out.println("Press1 for :Billing and Payment Inquries");
                System.out.println("Press2 for :Technical Support");
                System.out.println("Press3 for :Add Product and Service");
                System.out.println("Press4 for :Account Changes");
                int mainmenu = scanner.nextInt();
                 if (mainmenu == 1){
                     System.out.println("Press1 for :Last Bill Info");
                     System.out.println("Press2 for :Make a Bill Payment");
                     System.out.println("Press3 for :Payment Arrangement");
                     System.out.println("Press4 for :Travel Related Inquries");

            } else if (mainmenu == 2){
                     System.out.println("Press1 for :Unlock a Device");
                     System.out.println("Press2 for :Activate a Sim Card");
                     System.out.println("Press3 fro :Troubleshooting");

                 }else if (mainmenu == 3){
                     System.out.println("Press1 For : All Your Mobile Needs Including 5g Internet");
                     System.out.println("Press2 For : Residential Services");

                 } else if (mainmenu == 4){
                     System.out.println("Press1 for:Travel Realted Inquries");
                     System.out.println("Press2 for :Lost or Stolen Phone Service");
                     System.out.println("Press3 for :Hardware Upgrade");
                     System.out.println("Press4 for :Change a Service");
                     System.out.println("Press5 for :Cancel a Sevice");
                 }
                 int option = scanner.nextInt();
                 if (option == 1){
                     System.out.println("We will forward your call to customer service representative");

                 } else if (option == 2){
                     System.out.println("We will forward your call to customer service representative");

                 }
                }
            }
        }