package session3.assignmentFilesSession3;
import java.util.Scanner;

public class level3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double totalPurchase = 0;
        boolean isMember;

        System.out.print("\nPlease enter your total purchase amount: ");
        totalPurchase = input.nextDouble();

        System.out.print("\nAre you a member? (true/false): ");
        isMember = input.nextBoolean();

        if (totalPurchase >= 100000 || isMember){
            System.out.println("\nCongrats!, you got free shipping for your purchase.\n");
        } else {
            System.out.println("\nPlease note that there will be an additional shipping fee for your purchase. Thank you.\n");
        }
        input.close();;
    }
}
