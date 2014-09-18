package MainPackage;
import java.io.*;
//still not sure how exceptions work
public class InsufficientFundsException extends Exception{

	private double funds;
	
	public InsufficientFundsException(double funds) {
		// TODO Auto-generated constructor stub
		
		      this.funds = funds;
		   } 
		public double getfunds()
		   {
		      return funds;
		   }
	
	

}
