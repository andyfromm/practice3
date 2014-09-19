package MainPackage;
import java.text.*;

public class Test {
	
	public static void main (String[] args){
		
		int id = 1122;
		double balance = 20000;
		double annualInterestRate = 4.5;
		DecimalFormat dollaz = new DecimalFormat("0.00");
		
		
		Account acct = new Account(id, balance, annualInterestRate);
		acct.withdraw(2000);
		acct.deposit(3000);
		
		System.out.println("Balance is " + dollaz.format(acct.getbalance()));
		System.out.println("Monthly Interest is " + dollaz.format(acct.getmonthlyrate(annualInterestRate)));
		System.out.println("This account was created " + acct.getdate());
		


		
	}

	public Test() {
		//super(id, balance, annualInterestRate);
		// TODO Auto-generated constructor stub
		
		
		
		
	}
	
	/*Account newacc = new Account (1122, 20000, 4.5){
		newacc.withdraw(2000);
		newacc.deposit(3000);
		
		//i am doing something wrong, i do not understand enough on classes and extending
		//if everything was working right and the correct numbers were brought in i could
		//easily get there to be printed monthly rate, balance, and the date
		//
		*/
		
	

}
