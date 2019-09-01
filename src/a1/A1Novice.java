package a1;

import java.util.Scanner;

public class A1Novice {

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	int customers, itemsBought, itemAmount;
        double price, finalPrice = 0;
        String firstName, lastName;
        char firstInitial;
        customers = scan.nextInt();
        
        for (int i = 0; i < customers; i++) {
            firstName = scan.next();
            lastName = scan.next();
            firstInitial = firstName.charAt(0);
            itemsBought = scan.nextInt();
            
            for (int j = 0; j < itemsBought; j++) {
                itemAmount = scan.nextInt();
                scan.next();
                price = scan.nextDouble();
                price = itemAmount * price;
                finalPrice += price;
            }
            System.out.println(firstInitial + ". " + lastName + ": " + String.format("%.2f", finalPrice));
            finalPrice = 0;
        }
    }
}
