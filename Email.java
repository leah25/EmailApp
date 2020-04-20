package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength=10;
	private String companySuffix = "company.com";


// what we need:
// constructor to receive the firstName and lastName
	public Email(String firstName, String lastName) {
		this.firstName =firstName;
		this.lastName = lastName;
		//System.out.println("email is for "+ this.firstName+ " " +this.lastName);
		
		// calling a method for department
		
		this.department = setDepartment();
		
		
		//call a method that generates random password.
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("password:"+ this.password);
		
		// generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"+ this.department + "."+ companySuffix;
	
		}
	//ask for department
	private String setDepartment() {
		System.out.print("New Employee: " + firstName +" "+ lastName+ "\nDEPARTMENT CODES: \n 1 for Sales \n 2 for Development \n 3 for Accounting \n 0 for none \n Enter department code:");
		Scanner scanner = new Scanner(System.in);
		int Choice= scanner.nextInt();
		
		if(Choice ==1) {
			return "sales";
		}else if(Choice == 2){
			return "Development";
		}else if(Choice ==3) {
			return "Accounting";
		}else {
			return "";
		}
		
		
	}
	
// generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIKLMNOPQRSTUVWXYZ0123456789@#$%%^*.*";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i]= passwordSet.charAt(rand);
			
		}
		return new String (password);
	}
// set mailbox capacity
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	// set an alternative email
	public void setAlternateEmail(String altEmail ) {
		this.alternateEmail = altEmail;
	}

// change the password
	public void setChangePassword(String password) {
		this.password = password;
	}
	
	// retrieving using get methods
	 public int getmailboxCapacity() {
		 return mailboxCapacity;
	 }
	 public String getAlternateEmail() {
		 return alternateEmail;
	 }
	 public String getChangePassword() {
		 return password;
	 }
	 public String showInfo() {
		 return "NAME: "+ firstName +" "+ lastName  +
				 "\nCompany Email: " + email +
				 "\nMailbox Capacity : "+ mailboxCapacity + "mbs.";
				 
	 }
}