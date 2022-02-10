package oops.abstraction;

public class Kotak implements RBI {

	@Override
	public void savingaccount() {
		System.out.println("Kotak= Saving account");		
	}

	@Override
	public void currentaccount() {
		System.out.println("kotak - Current account");
		
	}

	@Override
	public void creditcard() {
		System.out.println("Kotak- Creditcard");
		
	}

	@Override
	public void debitcard() {
		System.out.println("kotak- Debitcard");
		
	}
	

}
