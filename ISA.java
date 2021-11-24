

 //class Account{
abstract class Account{
	int id;
	final String branch = "Noida"; 
	String name;
	void deposit() {
		System.out.println("Account Deposit");
	}
	void withDraw() {
		System.out.println("Account WithDraw");
	}
	final void checkBalance() {
		System.out.println("Account Check Balance");
	}
	//abstract void roi();
	 void roi() {
		System.out.println("Generic ROI By Account");
	}
}
final class SavingAccount extends Account{
	@Override
	void roi() {
		System.out.println("Low Interest Rec From Bank");
	}
	void limitedTransInADay(){
		System.out.println("Trans Limit is 5");
	}
}
class CurrentAccount extends Account{
	@Override
   void roi() {
		System.out.println("U need pay to the Bank");
	}
	void odLimit(){
		System.out.println("OD Limit in Current Account");
	}
}
class FixedDepositAccount extends Account{
	@Override
	void roi() {
		System.out.println("High ROI pay by Bank");
	}
	void lockingPeriod(){
		System.out.println("Amount is Locked for Sometime");
	}
}

class Caller{
	static void callMe(Account account) {
		account.withDraw();
		account.deposit();
		account.roi();
		System.out.println("**********************");
		if(account instanceof SavingAccount) {
			SavingAccount sa = (SavingAccount) account ; // Downcasting
			sa.limitedTransInADay();
		}
		else
			if(account instanceof FixedDepositAccount) {
				FixedDepositAccount fa = (FixedDepositAccount) account ; // Downcasting
				fa.lockingPeriod();
			}	
			else
				if(account instanceof CurrentAccount) {
					((CurrentAccount) account).odLimit();
				}
	}
}

public class ISA {

	public static void main(String[] args) {
		//Caller.callMe(new Account());
		final int X = 10;
		final SavingAccount sa = new SavingAccount();
		Caller.callMe(new SavingAccount());
		Caller.callMe(new CurrentAccount());
		Caller.callMe(new FixedDepositAccount());
//		Account account = new FixedDepositAccount();
//		account.withDraw();
//		account.deposit();
//		account.roi();
		//account.limitedTransInADay();
		// TODO Auto-generated method stub
		/*SavingAccount savingAccount = new SavingAccount();
		savingAccount.checkBalance();
		savingAccount.withDraw();
		savingAccount.roi();
		savingAccount.limitedTransInADay();
		System.out.println("**********************************");
		CurrentAccount currentAccount = new CurrentAccount();
		currentAccount.checkBalance();
		currentAccount.withDraw();
		currentAccount.roi();
		currentAccount.odLimit();
		System.out.println("**********************************");
		FixedDepositAccount fd = new FixedDepositAccount();
		fd.checkBalance();
		fd.withDraw();
		fd.roi();
		fd.lockingPeriod();*/
		

	}

}
