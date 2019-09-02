// Hey Jon...lmk if u see this
// I can see this
// nice :) 


package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int totalItemsCount, customers, totalUniqueItems, tempNumItems;
		String[] itemName, firstName, lastName;
		double[] itemPrices;
		int[] itemCount, customerCount;
		boolean[] customerBuy;
		String itemBought;
		
		totalItemsCount = scan.nextInt();
		itemName = new String[totalItemsCount];
		itemPrices = new double[totalItemsCount];
		itemCount = new int[totalItemsCount];
		customerCount = new int[totalItemsCount];
		
		for (int i = 0; i < totalItemsCount; i++) {
			itemName[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		
		customers = scan.nextInt();
		firstName = new String[customers];
		lastName = new String[customers];
			
		for (int i = 0; i < customers; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			totalUniqueItems = scan.nextInt();
			customerBuy = new boolean[totalItemsCount];
			
			for (int j = 0; j < totalUniqueItems; j++) { 
			    tempNumItems = scan.nextInt();
			    itemBought = scan.next();
			    
			for (int k = 0; k < itemName.length; k++) {
					if (itemName[k].contains(itemBought)) {
						itemCount[k] = itemCount[k] + tempNumItems;
						customerBuy[k] = true;
						}
			}

		}
      			for (int l = 0; l < itemName.length; l++) {
				  if (customerBuy[l]) {
						customerCount[l] = customerCount[l] + 1;
					}
			}
		}
		for (int i = 0; i < itemCount.length; i++) {
			if (customerCount[i] == 0) {
				System.out.println("No customers bought " + itemName[i]);
			}
			else {
			  System.out.println(customerCount[i] + " customers bought "+ itemCount[i] + " " + itemName[i]);
			}
		}
		
		scan.close();
	}
}
	



//I want to die.