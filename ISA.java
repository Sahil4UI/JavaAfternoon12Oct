class Account 
{
	int id;
	String name;
	double balance;
	
	void deposit()
	{
		System.out.println("*******Account Deposit******");
	}
	
	void WithDraw()
	{
		System.out.println("*******Account Withdraw******");
	}
}


class CurrentAccount extends Account
{
	void roi()
	{
		System.out.println("Pay 5% ROI");
	}
}


class SavingAccount extends Account
{
	@Override
	void WithDraw() {
//		super.WithDraw();
		System.out.println("Saving Account Withdraw ");
	}
	
	void roi()
	{
		System.out.println("Pay 3% ROI");
	}
}

public class ISA {

	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount();
		sa.WithDraw();
		sa.roi();
		
		CurrentAccount ca = new CurrentAccount();
		ca.deposit();
		ca.WithDraw();
		ca.roi();
				
		
	}
			
}
