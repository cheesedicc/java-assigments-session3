package session3.assignmentFilesSession3;
import java.util.Scanner;

public class level4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        double score = 0;
        double attendance = 0;
        double assignmentsCompletion = 0;

        System.out.println("\nWelcome to the assessment system!\n");

        System.out.print("Enter your score: ");
        score = input.nextDouble();

        System.out.print("\nEnter your attendance rate (%): ");
        attendance = input.nextDouble();

        System.out.print("\nEnter your assignments completion rate (%): ");
        assignmentsCompletion = input.nextDouble();

        if (score >= 60 && attendance >= 75 && assignmentsCompletion >= 80){
            System.out.println("\nCongratulations!, you've passed.\n");
        }
        else if (score < 60){
            System.out.println("\nSorry, you failed. Your score of " + score + " does not exceed the required mark.\n");
        }
        else if (attendance < 75){
            System.out.println("\nSorry, you failed. Your attendance rate of " + attendance + " does not exceed the required percentage.\n");
        }
        else if (assignmentsCompletion < 80){
            System.out.println("\nSorry, you failed. Your assignments completion rate of " + assignmentsCompletion + " does not exceed the required percentage.\n");
        }
        input.close();
    }
}
