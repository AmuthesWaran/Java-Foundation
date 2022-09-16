package miniTasks.netBankingLoanInterface;

public class MainClass {

	public static void main(String[] args) {
				
				
			Customer newCustomer = new Customer();
			
			newCustomer.fillHomeLoanForm();
			newCustomer.submitdocumets();
			
			System.out.println();
			
			newCustomer.hasBankingAccount();
			newCustomer.signUpForNetBanking();
	}

}
