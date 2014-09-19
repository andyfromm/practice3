package MainPackage;
import java.util.Date;
import java.util.Scanner;


public class Account {
	
	Scanner input = new Scanner(System.in);
	public int id = 0;
	public double balance = 0;
	public double annualInterestRate = 0;
	public Date dateCreated;
	public double withdrawamount;
	public double depositamount;
	
	
	//gets and sets
	public int getid (){
		return id;
	}
	public void setid (int newid){
		id = newid;
	}
	public double getbalance (){
		return balance;
	}
	public void setbalance (double newbalance){
		balance = newbalance;
	}
	public double getrate (){
		return annualInterestRate;
	}
	public void setrate (double newrate){
		annualInterestRate = newrate;
	}
	public double getmonthlyrate (double annualInterestRate){
		double monthlyrate = (annualInterestRate / 12);
		return (monthlyrate);//this is to get monthly rate when needed
	}
	public Date getdate (){
		return dateCreated;
	}
	public void withdraw (double withdrawamount){//throws
										//InsufficientFundsException{
		
		if (withdrawamount <= balance){
		balance = balance - withdrawamount;
		}
		else{
			double funds = withdrawamount - balance;
			System.out.println("You don't have enough money, you need an extra " + funds);
			//throw new InsufficientFundsException(funds);
		}
	}
	
	public void deposit (double depositamount){
		balance = balance + depositamount;
	}
	
	
	public Account (){
		
	}
	
	//this is the no arg constructor
	
	public Account (int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		
			
	}
	
	//this is the arg constructor
	
	
	

}
