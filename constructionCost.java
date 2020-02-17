/*	• Write Program to estimate house construction cost, based on various
materials
Construction cost per square feet is
• 1200INR if we use standard materials
• 1500INR if we use above standard materials
• 1800INR if customers needs high standard material
• 2500INR if customer needs high standard material and fully
automated home
• Input will be material standard, total area of house and if they want
fully automated home	*/
import java.util.*;

class constructionCost
{
	static
	{	
		int choice;
		double areaOfHouse;
		
		Scanner inPut = new Scanner(System.in);
		System.out.println("Enter area of the house in square feet: ");
		areaOfHouse=inPut.nextDouble();

		System.out.print("\n Enter material standard: by choosing a number from below: ");
		System.out.print("\n 1. Standard materials");
		System.out.print("\n 2. Above standard materials");
		System.out.print("\n 3. High standard material");
		System.out.print("\n 4. High standard material and fully automated home");
		choice = inPut.nextInt();
		switch(choice)
		{
			case 1:
				System.out.print("\n Estimated construction cost in INR: " + areaOfHouse*1200);
				break;

			case 2:
				System.out.print("\n Estimated construction cost in INR: " + areaOfHouse*1500);
				break;
			
			case 3:
				System.out.print("\n Estimated construction cost in INR: "  + areaOfHouse*1800);
				break;
			
			case 4:
				System.out.print("\n Estimated construction cost in INR: "  + areaOfHouse*2500);
				break;
			
			default:
				System.out.print("\n Sorry try again!");
				break;
		}
		System.exit(0);
	}

	public static void main(String[] args) 
	{	}	
}
