package chapter4.CarMillage;

import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int milesDriven = 0;
        int gallonUsed = 0 ;
        int flagValue = 0;

        System.out.print("Enter number of miles driven: or Type -1 to quit: ");
        milesDriven = scan.nextInt();
        if (milesDriven == -1) {
            flagValue =-1 ;
        }
        else {
            System.out.print("Enter amount of gallon used: ");
            gallonUsed = scan.nextInt();
        }

        while (flagValue != -1){
            double milesPerGallon = (double) milesDriven / gallonUsed ;
            System.out.printf("""
                    %nYou drove %dmiles and used %dgallons,
                    The miles per gallon obtained for this trip is %.2f(mile per gallon)%n
                    """, milesDriven, gallonUsed, milesPerGallon);

            System.out.print("Enter next number of miles driven or Type -1 to quit: ");
            milesDriven = scan.nextInt();
            if (milesDriven == -1) {
                flagValue =-1 ;
            }
            else {
                System.out.print("Enter amount of gallon used: ");
                gallonUsed = scan.nextInt();
            }
        }




    }
}
