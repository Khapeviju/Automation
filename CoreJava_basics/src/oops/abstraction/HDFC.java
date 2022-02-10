package oops.abstraction;

public class HDFC implements RBI {

	@Override
	public void savingaccount() {
		System.out.println("HDFC- saving account");
		
	}

	@Override
	public void currentaccount() {
		System.out.println("HDFC - Current account");
		
	}

	@Override
	public void creditcard() {
		System.out.println("Creditcard");
		
	}

	@Override
	public void debitcard() {
		System.out.println("Debitcard");
		
	}

}
