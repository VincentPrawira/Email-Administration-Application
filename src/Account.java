import java.util.Scanner;

public class Account {
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
	
	private String firstName,lastName,fullName,department;
	private String email,password;
	private String alternateEmail;
	private int mailboxCapacity = 500;
	private static String companySuffix = "tulipcandle.com";
	
	public Account (String firstName,String lastName) {
		// set user firstName
		this.setFirstName(firstName);
		// set user lastName
		this.setLastName(lastName);
		// set user fullName
		this.fullName = this.firstName +" "+this.lastName;
		System.out.println("Hello Mr."+this.fullName+"!");
		
		// set user department
		Scanner scanner = new Scanner(System.in);
		System.out.println("List of Departments to pick:");
		System.out.println("Input-1 to enter the 'sales' department");
		System.out.println("Input-2 to enter the 'development' department");
		System.out.println("Input-3 to enter the 'accounting' department");
		System.out.print("Set your department : ");
		int departmentOption = scanner.nextInt();
		this.department = setDepartment(departmentOption);
		
		// set user email
		this.email = setEmail(this.firstName,this.lastName,this.department,companySuffix);
		
		// set user password with random password
		this.password = generatedRandomPassword(); 
		
	}
	// Generate email as according to the syntax 
	public String setEmail(String firstName, String lastName, String department, String companySuffix) {
		String email ="";
		// check if the department is null, otherwise add the department in the email
		if(department == "") {
			email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+companySuffix;
			System.out.println("Your new created Email is : "+email);
		}else {
			email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
			System.out.println("Your new created Email is : "+email);
		}
		return email;
	}
	
	// Determine the department
	public String setDepartment(int departmentChoice) {
		String department ="";
		switch(departmentChoice) {
			case 1 :
				department =  "sales";
				break;
			case 2 :
				department = "development";
				break;
			case 3 :
				department = "accounting";
				break;
			default : 
				department = "";
				System.out.println("You aren't in any department yet.");
				//System.out.println("You aren't in any department yet.Please pick your department of choice by inputting 1/2/3");
		}
		return department;
	}
	
	// Generate a random String for a password
	public String generatedRandomPassword() {
		String randomPassword = "";
		int passwordBufferLimit = 20;
		String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
								+"0123456789" 
								+"abcdefghijklmnopqrstuvwxyz";
		
		// create StringBuilder size of alphaNumericString 
		StringBuilder stringBuilder = new StringBuilder(passwordBufferLimit);
		for(int i=0; i<passwordBufferLimit;i++) {
			
			// generate a random number between 0 to alphaNumericString variable length
			int index = (int)(alphaNumericString.length()*Math.random());
			
			// add character one by one in the end of stringBuilder
			stringBuilder.append(alphaNumericString.charAt(index));
		}
		
		// convert the stringBuilder to a string, and finally return the String result as randomPassword
		randomPassword = stringBuilder.toString();
		
		System.out.println("Your password is: "+randomPassword);
		return randomPassword;
	}
	
	// - Have set methods to change the password, set the mailbox capacity, 
	// 	 and define an alternate email address
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// - Have set methods to change the password, set the mailbox capacity, 
	// 	 and define an alternate email address
	public void changePassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	// - Have get methods to display the name,email,and mailbox capacity
	public void showInfo() {
		System.out.println("FULL NAME : " +getFullName());
		System.out.println("ALTERNATE EMAIL : " +getAlternateEmail());
		System.out.println("CHANGED MAILBOX CAPACITY : "+getMailboxCapacity());
	}
	
}
