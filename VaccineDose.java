package abstractiondemoo;

import java.util.*;

abstract class vaccine
{

	abstract public void boosterDose(String y);
	static boolean check=false;
//concrete method -method has body
	public void firstDose()
	{
		int age;
		String country;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Age: ");
		age = sc.nextInt();
		System.out.println("Enter Country: ");
		country = sc.next();
		
//		int age = 45;
//		String country = "Indian";
		if(age>=18 && country.equalsIgnoreCase( "Indian")) 
		{	System.out.println("1st done Done, After vaccination user has to pay 250rs");
			check = true;
			}
			else
			{
				System.out.println("User is not eligible for vaccination");
		System.exit(0);
			}
		if(check==true)
			secondDose();
		
		
	}
	public void secondDose()
	{
		System.out.println("2nd Vaccination Done");
		
		
	}
}
//implementation class
class vaccinationSuccessful extends vaccine
{
	
	@Override
	public void boosterDose(String y) {
		if(y.equalsIgnoreCase(y))
			System.out.println("Booster Dose Successful");
		else
			System.out.println("Please take 1st and 2nd dose");
	}
}
public class VaccineDose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		vaccine v = new vaccinationSuccessful();
		
		      v.firstDose();
				
		System.out.println("did you take second dose?(y/n)");
		       String y=sc.next();
			 v.boosterDose(y);
			
		
		}

	}

