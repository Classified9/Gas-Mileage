package chapter5;

public class CompoundInterestCalculation {
    public static void main(String[] args) {

        int principal = 1000;
        double rate = 0.05;
        int noOfYears = 10;
        double a = 0;

        System.out.printf("%s%30s%n", "Year", "Amount on deposit");
        for (int i = 1; i <= noOfYears; i++){
            a = (double) principal * (Math.pow((1 + rate), i));
            System.out.printf("%n%4d%,22.3f%n", i , a);
        }

        //Practising on Justification specifier
        System.out.println("-----------------------------------------------------------------");
        for(int i =1; i <=3; ++i){
            System.out.printf("%n|%-20s|%-20s|%-20s|%n","x","y","z");
        }
        System.out.println("-----------------------------------------------------------------");
    }
}
