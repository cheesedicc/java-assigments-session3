package session3.assignmentFilesSession3;

import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalPurchase = 0;
        double totalAmount = 0;
        char currency = '$';

        System.out.print("\nPlease enter your total purchase amount: ");
        totalPurchase = input.nextDouble();

        if(totalPurchase >= 1000000){
            totalAmount = totalPurchase - (totalPurchase * 0.20);
        } else if(totalPurchase >= 500000){
            totalAmount = totalPurchase - (totalPurchase * 0.10);
        } else if(totalPurchase >= 250000){
            totalAmount = totalPurchase - (totalPurchase * 0.05);
        } else{
            totalAmount = totalPurchase;
        }
        System.out.println("\nYour total is " + currency + totalAmount + "." );
        input.close();
    }
}
