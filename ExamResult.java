package chapter5;

import java.util.Scanner;

public class ExamResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int result = 0;
        int aGrade = 0;
        int bGrade = 0;
        double total = 0;

        for(count = 0; count < 10; count++){
            System.out.print("Enter result: ");
            result = scan.nextInt();
            if(result == 1){
                aGrade++;
            }else {
                bGrade++;
            }
        }

        System.out.printf("%nThe number of student with A grade :%d%n", aGrade);
        System.out.printf("The number of student with B grade :%d%n", bGrade);

        if(aGrade > 8){
            System.out.printf("%nBonus to the instructor!%n");
        }
    }
}
