abstract class Loan{
	int amount;
	int duration;
	int id;
	
	abstract void emi();

	Loan()
	{
		System.out.println("Loan Class Default Constructor");
	}
	
	
	Loan(int x)
	{	this();
		System.out.println("Loan class Parameterized Constructor");
	}
	
	
	void gurantee()
	{
		System.out.println("Guarantee Needed");
	}
	
	void docSubmit()
	{
		System.out.println("Document submitted");
	}
	
	void apply() {
		System.out.println("Apply for loan");
	}
	
	void roi() {
		System.out.println("ROI 7%");
	}
	
}


class HomeLoan extends Loan
{

	@Override
	void emi() {
		// TODO Auto-generated method stub
		
	}
	
	HomeLoan()
	{
		System.out.println("HomeLoan Class Default Constructor");
	}
	
	
	HomeLoan(int x)
	{	this();
		System.out.println("HomeLoan class Parameterized Constructor");
	}
	
	@Override
	void roi()
	{
		System.out.println("ROI 9%");
	}
	
	void Insurance()
	{
		System.out.println("Must have insurance in HL");
	}
	
	void security()
	{
		System.out.println("Give security to HL");
	}
}

class AutoLoan extends Loan{
	@Override
	void roi()
	{
		System.out.println("ROI 11%");
	}

	@Override
	void emi() {
		// TODO Auto-generated method stub
		
	}
	
}

class PersonalLoan extends Loan{
	@Override
	void roi()
	{
		System.out.println("ROI 15%");
	}

	void lessDuration()
	{
		System.out.println("Less duration in PL");
	}
	@Override
	void emi() {
		// TODO Auto-generated method stub
		
	}
	
}

class LoanCaller{
	
	void call(Loan loanObject)
	{
		loanObject.apply();
		loanObject.gurantee();
		loanObject.docSubmit();
		loanObject.roi();
		
		if (loanObject instanceof HomeLoan)
		{
			HomeLoan hl=(HomeLoan)loanObject; //DownCasting
		}
		if (loanObject instanceof AutoLoan)
		{
			
			AutoLoan hl=(AutoLoan)loanObject; //DownCasting
		}
		System.out.println("***********************");
	}
}


public class UpcastingDowncasting {
	public static void main(String[] args) {
		LoanCaller lc=new LoanCaller();
		lc.call(new HomeLoan(1000));
//		lc.call(new AutoLoan());
//		AutoLoan al = new AutoLoan();
		Loan al = new AutoLoan();//upcasting
		al.apply();
		al.gurantee();
		al.docSubmit();
		al.roi();
	}
	
}
