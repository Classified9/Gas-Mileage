package chapter5;

import java.util.Scanner;

public class EmployeesSalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String employeeName = "";
        int time = 0;
        double rate = 0;
        double grossPay = 0;
        int extraTime = 0;
        double hour40grossPay = 0;
        double ceilingGrossPay= 0;

        System.out.println("Welcome to Salary Calculator\n");

        System.out.print("""
        Enter Employee name: 
        OR type <Ctrl> d to exit: """ );
        while(scan.hasNext()) {
            employeeName = scan.next();
            System.out.print("Enter number of hour(s) worked: ");
            time = scan.nextInt();
            System.out.print("Enter employee hourly rate: ");
            rate = scan.nextDouble();
           // rate /= 100 ;

            if (time > 40) {
                extraTime = time - 40;
                hour40grossPay = 40 * rate;
                ceilingGrossPay = extraTime * (rate * 0.5);

                grossPay = hour40grossPay + ceilingGrossPay;
            }


            if (time == 40) {
                grossPay = rate * 40;
            }

            System.out.printf("%nEmployee %s: Gross pay is- %.2f%n", employeeName, grossPay);

            System.out.print("""
                    Enter Employee name:
                    OR type <Ctrl> d to exit: """);
        }
    }
}
