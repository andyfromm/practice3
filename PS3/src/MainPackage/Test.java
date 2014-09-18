package MainPackage;

public class Test extends Account{

	public Test(int id, double balance, double annualInterestRate) {
		super(id, balance, annualInterestRate);
		// TODO Auto-generated constructor stub
	}
	
	Account newacc = new Account (1122, 20000, 4.5){
		newacc.withdraw(2000);
		newacc.deposit(3000);
		//i am doing something wrong, i do not understand enough on classes and extending
		//if everything was working right and the correct numbers were brought in i could
		//easily get there to be printed monthly rate, balance, and the date
		//
		
		}
	

}
