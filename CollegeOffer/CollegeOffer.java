package chapter4.CollegeOffer;


import java.util.Scanner;

public class CollegeOffer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0 ;
        int noOfPass = 0 ;
        int noOfFail = 0 ;


//        System.out.print("Enter result(1 = pass, 2 = fail) or -1 to quit: ");
//        int testResult = scan.nextInt();

        //testing sentinel value
//        while (testResult != -1){
            while(counter < 10){
                System.out.print("Enter result(1 = pass, 2 = fail): ");
                int testResult = scan.nextInt();
                ++counter ;
                if (testResult == 1){
                    ++noOfPass;
                }
                else {
                    ++noOfFail;
                }
//                testResult = -1;
            }
       // }


        System.out.printf("%nPassed: %d%nFailed: %d%n", noOfPass, noOfFail);

        if (noOfPass >= 8) System.out.printf("%n%s%n","Bonus to instructor");









    }
}
