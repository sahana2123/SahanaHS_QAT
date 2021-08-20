package SahanaHS_QATtest;

public class CurrentAccount implements BankAccount {
	@Override
	public void checkBankBalance() {
		System.out.println(" ***balance of current account is ***");
		
	}

	@Override
	public void validateUser() {
		System.out.println("***Validate current account use***");
	}
}
