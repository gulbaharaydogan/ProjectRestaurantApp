package cse;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface BeverageTypes { // create an interface for drink's types
	
	void serviceTime(); //an abstract method
	void warning(); // an abstarct method
}
abstract class beverageAbstract {
	
	public int number() { 
		
		Scanner scan = new Scanner(System.in); // create the scan object
		boolean continueInput = true;
		int adet = 0;
		

		do {
		try {
			System.out.println("How many of this product would you like? Please enter the number.");
			adet= scan.nextInt();
			foodAbstract.getException(adet);
			continueInput = false; // en the loop
		}
		catch (IllegalArgumentException e) {// to catch negative value 
			System.out.println("order number cannot be negative");
		}
		catch(InputMismatchException e){// to catch non integer value
			System.out.println("an integer is required");
			System.exit(1);
		}
		}while (continueInput);
		// until the customer  enter true value loop is going to be continue
		 
		System.out.println("Are you sure about this order number if you are sure enter y or n");
		char ch= scan.next().toLowerCase().charAt(0);
		char answer = 'y';
		char answer2 = 'n';

		while(ch != answer) {
			if(ch == answer2) 
			
			
			System.out.println("If you want to change order enter again and please enter y to continue");
			adet= scan.nextInt();
			ch = scan.next().charAt(0); 
		} 
	return adet;
	
	}
	
}

class ColdBeverages extends beverageAbstract implements BeverageTypes{
	
	// override the method to use in this class
	@Override
	public void serviceTime() {
		System.out.println("Your cold beverage is served immeadiately.");
		System.out.println();
	}

	// override the method to use in this class
	@Override
	public void warning() {
		System.out.println("Do not consume carbonated drinks frequently.");
		System.out.println();
	}

	
}

class HotTeaMenu extends beverageAbstract implements BeverageTypes{
	
	
	
	
	// override the method to use in this class
	@Override
	public void serviceTime() {
		System.out.println("Your tea is served within 5 minutes.");
		System.out.println();
	}


	// override the method to use in this class
	@Override
	public void warning() {
		System.out.println("Different types of tea can have effects.");
		System.out.println();
	}

	
}

class HotCoffeeMenu extends beverageAbstract implements BeverageTypes{
	
	
	
	
	// override the method to use in this class
	@Override
	public void serviceTime() {
		System.out.println("Your coffee is served within 8 minutes.");
		System.out.println();
	}


	// override the method to use in this class
	@Override
	public void warning() {
		System.out.println("Flavored syrups may cause an allergic reaction.");
		System.out.println();
	}

	
}

class SpeacialDrinks extends beverageAbstract implements BeverageTypes{
	
	
	
	
	// override the method to use in this class
	@Override
	public void serviceTime() {
		System.out.println("Your speacial drink is served within 8 minutes.");
		System.out.println();
	}

	// override the method to use in this class
	@Override
	public void warning() {
		System.out.println("Hazelnut syrup in special drinks can cause an allergic reaction.");
		System.out.println();
	}

	
}

class IcedDrinks extends beverageAbstract implements BeverageTypes{
	
	
	
	
	// override the method to use in this class
	@Override
	public void serviceTime() {
		System.out.println("Your iced drink is served within 8 minutes.");
		System.out.println();
	}


// override the method to use in this class
	@Override
	public void warning() {
		System.out.println("Eggs and gluten in our cold drink cream may be the cause of an allergic reaction.");
		System.out.println();
	}

	
}
