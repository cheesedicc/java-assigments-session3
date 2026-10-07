package session3.assignmentFilesSession3;

import java.util.Scanner;

public class level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double purchaseAmount = 0;

        System.out.print("\nPlease enter your purchase amount: ");
        purchaseAmount = input.nextDouble();

        if (purchaseAmount >= 100000){
            System.out.println("\nCongrats, you get free shipping!\n");
        } else {
            System.out.println("\nPlease note that there will be an additional shipping fee for your purchase.\n");
        }
        input.close();
    }
}
