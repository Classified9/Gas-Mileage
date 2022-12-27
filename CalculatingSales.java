package chapter5;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double product1 = 2.98;
        int product1QuantitySold = 1;
        double product2 = 4.50;
        int product2QuantitySold = 1;
        double product3 = 9.98;
        int product3QuantitySold = 1;
        double product4 = 4.49;
        int product4QuantitySold = 1;
        double product5 = 6.87;
        int product5QuantitySold = 1;
        double result = 0;
        String productName = "";

        System.out.print("Enter product name or Type 'exit' to exit: ");
        productName = scan.nextLine();
        while (!productName.equalsIgnoreCase("exit")){

            switch (productName) {
                case "product1" -> {
                    System.out.print("Enter quantity sold: ");
                    product1QuantitySold = scan.nextInt();
                    result += product1 * product1QuantitySold;
                    System.out.printf("%nPrice of total product bought: %.2f%n", result);
                }
                case "product2" -> {
                    System.out.print("Enter quantity sold: ");
                    product2QuantitySold = scan.nextInt();
                    result += product2 * product2QuantitySold;
                    System.out.printf("%nPrice of total product bought: %.2f%n",result);
                }
                case "product3" -> {
                    System.out.print("Enter quantity sold: ");
                    product3QuantitySold = scan.nextInt();
                    result += product3 * product3QuantitySold;
                    System.out.printf("%nPrice of total product bought: %.2f%n", result);
                }
                case "product4" -> {
                    System.out.print("Enter quantity sold: ");
                    product4QuantitySold = scan.nextInt();
                    result += product4 * product4QuantitySold;
                    System.out.printf("%nPrice of total product bought: %.2f%n",result);
                }
                default -> {
                    System.out.print("Enter quantity sold: ");
                    product5QuantitySold = scan.nextInt();
                    result += product5 * product5QuantitySold;
                    System.out.printf("%nPrice of total product bought: %.2f%n", result);
                }
            }
            System.out.print("Enter product name or Type 'exit' to exit: ");
            productName = scan.next();
        }
        
        System.out.printf("%nTotal sold is: %.2f%n",result);


    }
}
