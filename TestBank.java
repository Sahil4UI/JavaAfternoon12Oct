
public class TestBank {
	public static void main(String[] args) {
		SavingAccount ram = new SavingAccount();
		ram.SetSavings(1000);
		ram.balance +=1000;
		ram.checkBalance();
	}
}
