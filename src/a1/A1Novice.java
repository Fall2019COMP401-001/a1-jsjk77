package a1;

import java.util.Scanner;

public class A1Novice {
	public static int customers, itemsBought, itemAmount;
    public static double price, finalPrice;
    public static String first, last;
    public static char firstInitial;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        customers = scan.nextInt();
        for (int i = 0; i < customers; i++) {
            first = scan.next();
            last = scan.next();
            firstInitial = first.charAt(0);
            itemsBought = scan.nextInt();

            for (int j = 0; j < itemsBought; j++) {
                itemAmount = scan.nextInt();
                scan.next();
                price = scan.nextDouble();
                price = itemAmount * price;
                finalPrice += price;
            }
            System.out.println(firstInitial + ". " + last + ": " + String.format("%.2f", finalPrice));
            finalPrice = 0;
        }
    }
}
