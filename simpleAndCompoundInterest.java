/*• Write Program to calculate simple interest, and compound interest */
import java.util.*;
import java.lang.Math;

class  simpleAndCompoundInterest
{
	static
	{
		double amount,rateOfInterest,simpleInterest,compoundInterest;
		int timeInYears,count;
		Scanner inPut = new Scanner(System.in);
		
		System.out.print("Enter  Initial amount: \n");
		amount = inPut.nextDouble();

		System.out.print("Enter  Rate of Interest: \n");
		rateOfInterest = inPut.nextDouble();
		
		System.out.print("Enter  Time in Years: \n");
		timeInYears = inPut.nextInt();

		System.out.print("Enter no. of how many times paid in given period: \n");
		count = inPut.nextInt();

		simpleInterest = (amount*rateOfInterest*timeInYears)/100;
		compoundInterest = amount*Math.pow(1+(rateOfInterest/count),count*timeInYears) - amount;

		System.out.print("\n Simple interest for given details: "+simpleInterest);
		System.out.print("\n Compound interest for given details: "+ compoundInterest);

		System.exit(0);
	}

	public static void main(String agrs[])
	{	}	
}
