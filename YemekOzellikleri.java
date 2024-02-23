package cse;

import java.util.InputMismatchException;
import java.util.Scanner;

interface  foodFeatures { // create an interface for food's features
	
	void serviceTime(); // an abstarct method
	void warning(); // an abstarct method
}

abstract class foodAbstract{
	
	 public int number() { 


		Scanner scan = new Scanner(System.in); // scan object
		boolean continueInput = true;
		int adet = 0;
		
		
		do {
		try {
			System.out.println("How many of this product would you like? Please enter the number.");
			adet= scan.nextInt();
			getException(adet);
			continueInput = false; // end the loop 
		}
		catch (IllegalArgumentException e) { // to catch negative value 
			System.out.println("order number cannot be negative");
		}
		catch(InputMismatchException e){ // to catch non integer value
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

	public static void getException(int adet) 
		throws IllegalArgumentException, InputMismatchException {
			if (adet < 0 ) {
				throw new IllegalArgumentException("cannot be neative");}
		// create a method to catch the error when customer entered negative value
		}
		
	}

	

class Hamburger extends foodAbstract implements foodFeatures{
		
	// override the method for hamburger class
		@Override
		public void serviceTime() {
			System.out.println("There is a 10-minute preparation time for the hamburger.");
			System.out.println();
		}
		
		// override the method for hamburger class
		@Override
		public void warning() {
			System.out.println("Cereals containing gluten, dairy products, sesame components can cause allergies.");
			System.out.println();
		}
	}

	class Pizza extends foodAbstract implements foodFeatures{
		
		// override the method for pizza class
		@Override
		public void serviceTime() {
			System.out.println("There is a 20-minute preparation time for the pizza.");
			System.out.println();
		}

		// override the method for pizza class
		@Override
		public void warning() {
			System.out.println("Gluten, tomato sauce, mushroom, cheese components can cause allergies.");
			System.out.println();
		}

	}

	class Pasta extends foodAbstract implements foodFeatures{
		
		// override the method for pasta class
		@Override
		public void serviceTime() {
			System.out.println("There is a 10-minute preparation time for the pasta.");
			System.out.println();		
		}

		// override the method for pasta class
		@Override
		public void warning() {
			System.out.println("Gluten, pasta sauce, mushroom components can cause allergies.");
			System.out.println();
		}

		
	}

	class Soup extends foodAbstract implements foodFeatures{
		
		// override the method for soup class
		@Override
		public void serviceTime() {
			System.out.println("There is a 10-minute preparation time for the soup.");
			System.out.println();
		}

		
		// override the method for soup class
		@Override
		public void warning() {
			System.out.println("Gluten and egg components can cause allergies.");
			System.out.println();
		}

		
	}

	class Steak extends foodAbstract implements foodFeatures{
		
		// override the method for steak class		
		@Override
		public void serviceTime() {
			System.out.println("There is a 20-minute preparation time for the meatball.");
			System.out.println();
		}

		
        // override the method for steak class
		@Override 
		public void warning() {
			System.out.println("Breadcrumbs, egg components can cause allergies.");
			System.out.println();
		}

		
	}

