package MainPackage;
import java.util.Date;
import java.util.Scanner;


public class Account {
	
	Scanner input = new Scanner(System.in);
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	private double withdrawamount;
	private double depositamount;
	
	
	//gets and sets
	private int getid (){
		return id;
	}
	private void setid (int newid){
		id = newid;
	}
	private double getbalance (){
		return balance;
	}
	private void setbalance (double newbalance){
		balance = newbalance;
	}
	private double getrate (){
		return annualInterestRate;
	}
	private void setrate (double newrate){
		annualInterestRate = newrate;
	}
	private double getmonthlyrate (double annualInterestRate){
		double monthlyrate = (annualInterestRate / 12);
		return (monthlyrate);//this is to get monthly rate when needed
	}
	private Date getdate (){
		return dateCreated;
	}
	private void withdraw (double withdrawamount){//throws
										//InsufficientFundsException{
		
		if (withdrawamount <= balance){
		balance = balance - withdrawamount;
		}
		else{
			double funds = withdrawamount - balance;
			println("You don't have enough money, you need an extra " + funds);
			//throw new InsufficientFundsException(funds);
		}
	}
	private void deposit (double depositamount){
		balance = balance + depositamount;
	}
	
	
	public Account newacc = new Account (){
		
	}
	
	//this is the no arg constructor
	
	public Account (int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		
			
	}
	
	
	
	
	

}
