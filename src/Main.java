import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// Project : Email Application
		// Scenario : You're an IT Support Administrator Specialist and 
		// are charged with the task of creating email accounts for new hires.
		
		// Your application should do the following :
		// - Generate an email with the following syntax : 
		//   firstname.lastname@department.company.com
		
		// - Determine the department (sales, development, accounting), 
		//   if none leave blank
		
		// - Generate a random String for a password
		
		// - Have set methods to change the password, set the mailbox capacity, 
		// 	 and define an alternate email address
		
		// - Have get methods to display the name,email,and mailbox capacity
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("~~Welcome to the sales email creation app for PT.Tulip Candle!~~");
		System.out.println("(Register Section)");
		System.out.print("Insert your first name: ");
		String firstName = scanner.next();
		System.out.print("Insert your last name: ");
		String lastName = scanner.next();
		
		Email email1 = new Email(firstName,lastName);

		email1.setAlternateEmail("prawiravincent98@gmail.com");
		email1.changePassword("Vincent5640272!");
		email1.setMailboxCapacity(1500);
		email1.showInfo();
		
		scanner.close();
		
		
		
	}
}
