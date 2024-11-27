import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		char choice = 'q';
		
		do {
		
			System.out.println("====================================");
			System.out.println("Welcome to the Online Sales System");
			System.out.println("Please Make Your Selection");
			System.out.println("Enter s to search\nEnter q to quit");
			System.out.println("====================================");
	
			Scanner kb = new Scanner(System.in);
			choice = kb.next().charAt(0);
			
			if (choice == 's') {
				System.out.println("You are Ready to Search for a Product");
			}
			if (choice == 'g') {
				System.out.println("Getting all products");
				Product p = new Product();
				p.GetAllProducts();
			}
			else if (choice == 'q') {
				System.out.println("Thank you for using the system");
			}
			else {
				System.out.println("You entered an invalid input. Please try again");
			}
			System.out.println();
			
		}while (choice != 'q');
		
	}

}
