package SahanaHS_QATtest;

public class Mianclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			CurrentAccount c=new CurrentAccount();
			SavingsAccount s=new SavingsAccount();
			c.checkBankBalance();
			c.validateUser();
			s.checkBankBalance();
			s.validateUser();
	}

}
