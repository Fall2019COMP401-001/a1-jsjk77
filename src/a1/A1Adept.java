package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int totalItems, customers, totalUniqueItems, tempNumItems;
		String[] itemName;
		double[] itemPrice, finalTotalPerPerson;
		double totalForPerson;
		String[] firstName, lastName;
		
		totalItems = scan.nextInt();
		itemName = new String[totalItems];
		itemPrice = new double[totalItems];
		
		for (int i = 0; i < totalItems; i++) {
			itemName[i] = scan.next();
			itemPrice[i] = scan.nextDouble();
		}	
		
		customers = scan.nextInt();
		firstName = new String[customers];
		lastName = new String[customers];
		finalTotalPerPerson = new double[customers];
			
		for (int i = 0; i < customers; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			
			totalUniqueItems = scan.nextInt();
			totalForPerson = 0;
			
			for (int j = 0; j < totalUniqueItems; j++) { 
			    tempNumItems = scan.nextInt();
			    String itemBought = scan.next();
			    //System.out.println(tempNumItems + " " + itemBought);
			    int tempIndex = 0;
			    
				for (int l = 0; l < itemName.length; l++) {
					if (itemName[l].contains(itemBought)) {
						tempIndex = l;
						//System.out.println(tempIndex);
						break;
						}
					}
				
				double tempPrice = itemPrice[tempIndex];
				//System.out.println(tempPrice);
				double sum = 0;
				sum = tempPrice * tempNumItems;
//				for (int k = 0; k < tempNumItems; k++) {
//			        sum += tempPrice;
//			        //System.out.println(firstName[i] + " " + sum);
//			    	}
				
				totalForPerson += sum;
				//System.out.println(totalForPerson);
				if (j + 1 == totalUniqueItems) {
					finalTotalPerPerson[i] = totalForPerson;
				}
			
			}
			
			finalTotalPerPerson[i] = totalForPerson; 
			//System.out.println(firstName[i] + " " + totalForPerson);
			
				}
		
		int indexMax = 0;
		double maximum = finalTotalPerPerson[0];
		for (int i = 0; i < customers; i++) {
			if (finalTotalPerPerson[i] > maximum) {
				maximum = finalTotalPerPerson[i];
				indexMax = i;
				
			}
			}
		
		int indexMin = 0;
		double minimum = finalTotalPerPerson[0];
		for (int i = 0; i < customers; i++) {
			if (finalTotalPerPerson[i] < minimum) {
				minimum = finalTotalPerPerson[i];
				indexMin = i;
			}
			}
		
		double averageSum = 0;
		for (int i = 0; i < customers; i++) {
			averageSum += finalTotalPerPerson[i];
		}
		double average = averageSum / customers;
	
		System.out.println("Biggest: " + firstName[indexMax] + " " + lastName[indexMax] + " " + "(" + String.format("%.2f", maximum) + ")");
		System.out.println("Smallest: " + firstName[indexMin] + " " + lastName[indexMin] + " " + "(" + String.format("%.2f", minimum) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		scan.close();
		}
}

