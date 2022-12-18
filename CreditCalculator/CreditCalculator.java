package chapter4.CreditCalculator;
import java.util.Scanner;

public class CreditCalculator {

    public class CreditLimitCalculator {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int accountNumber = 0;
            int initialBalance = 0;
            int newBalance = 0;
            int charges = 0;
            int credits = 0;
            int creditLimit = 0;
            int flagValue = 0;


            System.out.print("Enter customer account number or Type -1 to exit: ");
            accountNumber= scan.nextInt();
            if (accountNumber == -1) {
                flagValue = -1 ;
            }
            else {
                System.out.print("Enter customer balance: ");
                initialBalance = scan.nextInt();
                System.out.print("Enter total items charged by the end of this months: ");
                charges = scan.nextInt();
                System.out.print("Enter total credits applied to the customer account this months: ");
                credits = scan.nextInt();
                System.out.print("Enter customer allowed credit limit: ");
                creditLimit = scan.nextInt();
            }


            while (flagValue != -1){
                newBalance = initialBalance + charges - credits ;
                if (newBalance > creditLimit){
                    System.out.println("\nCredit limit exceeded\n");
                }
                else {
                    System.out.println("\nCustomer did not exceed limit.\n");
                }
                System.out.print("\nEnter customer account number or Type -1 to exit: ");
                accountNumber= scan.nextInt();
                if (accountNumber == -1) {
                    flagValue = -1 ;
                }
                else {
                    System.out.print("Enter customer balance: ");
                    initialBalance = scan.nextInt();
                    System.out.print("Enter total items charged by the end of this months: ");
                    charges = scan.nextInt();
                    System.out.print("Enter total credits applied to the customer account this months: ");
                    credits = scan.nextInt();
                    System.out.print("Enter customer allowed credit limit: ");
                    creditLimit = scan.nextInt();
                }
            }

            if (flagValue == -1){
                System.out.println("\nThank you for coming!\n");
            }



        }
    }
}
