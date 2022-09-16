package oops.classes;

public class BankCustomer {
	
	private int custId;
	private String custName;
	private int accNo;
	private String address;
	private int cardNo;
	private int age;
	private int pin;
	
	
	public void debit() {
		System.out.println("$25 is debited from the account no: "+accNo+" of the customer "+custName);
		
	}
	
	
	public void credit() {
		System.out.println("$50 is credited to the account no: "+accNo+" of the customer "+custName);
		
	}
	
	public void amend() {
		System.out.println("Customer"+custName+"'s"+address+"has been amended");
	}
	
	
	public void displayDetails() {
		
		System.out.println("Customer ID :"+custId);
		System.out.println("Customer Name :"+custName);
		System.out.println("Customer Age :"+age);
		System.out.println("Customer Address :"+address);
		
		
	}
	
	
}
