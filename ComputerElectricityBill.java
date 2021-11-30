import java.util.*;
import java.lang.Math;

class CalculateBill
{	
	double billpay; //variable to store the electricity bill calculated
 
	void Bill(long units)
	{
		// case when the number of units < 100
  	  if(units<100)
		billpay=units*1.20;

		// case when: 100 < number of units < 300
	  else if(units<=300)
		billpay=100*1.20+(units-100)*2;

		// case when the number of units > 300
	  else if(units>300)
		billpay=100*1.20+200 *2+(units-300)*3;
    }	 
}

class ComputeElectricityBill extends CalculateBill
{ 
	public static void main(String args[]) 
    {   
		//varaiable to store the number of units consumed
	    long units;
		
        System.out.println("\t----------------------------------------------------\t");
        System.out.println("\t            ELECTRICTY BILL CALCULATOR   \t");
        System.out.println("\t----------------------------------------------------\t");
		System.out.println("\n\n\t--------------------------------------------------\t");
        System.out.println("\t                     RATES             \t");
        System.out.println("\t--------------------------------------------------\t");
		System.out.println("\tNUMBER OF UNITS CONSUMED\t| RATE PER UNIT (INR)");
		System.out.println("\tLESS THAN 100           \t|         1.20       ");
		System.out.println("\t100 - 300               \t|         2.00       ");
		System.out.println("\tMORE THAN 300  		  \t|         3.00       ");
		System.out.println("\t--------------------------------------------------\t");
		
		// take the number of units consumed, from the user
	    Scanner sc=new Scanner(System.in);

	    System.out.println("\nPlease Enter the number of units consumed: ");

        units=sc.nextLong();

		// Create an object of the class ComputeElectricityBill
        ComputeElectricityBill b=new ComputeElectricityBill();

		// call the function Bill from the parent class CalculateBill
        b.Bill(units);
        	
		// display the calculated bill
		System.out.println("-----------------------------------------------------------");
		System.out.println("Units Consumed : " + units); 
        System.out.println("Total Amount to be paid : " + Math.round(b.billpay* 100.0) / 100.0 + " INR"); 
        System.out.println("\n-----------------------------------------------------------");
		System.out.println("\nTHANK YOU !\n");
        System.out.println("-----------------------------------------------------------");
      	
		
   } 
}
