package miniTasks.netBankingLoanInterface;

public class Customer implements HomeLoan, NetBanking {

	@Override
	public void hasBankingAccount() {
		System.out.println("Customer Has an Banking Account");
		
	}

	@Override
	public void signUpForNetBanking() {
		System.out.println("Customer signed up for Net Banking");
	}

	@Override
	public void fillHomeLoanForm() {
		System.out.println("Customer completed home loan application");
		
	}

	@Override
	public void submitdocumets() {
		System.out.println("Customer has submited the documents");
	}
		
}
