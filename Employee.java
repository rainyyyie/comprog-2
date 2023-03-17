package Package;
import java.util.Scanner;

	public class Employee {
		String name;
		char a;
		int rate;
	
	FullTimeEmployee Full = new FullTimeEmployee();
	PartTimeEmployee Part = new PartTimeEmployee();
	String getName;
   
	public void setName() {
	Scanner S = new Scanner (System.in);
	
	   System.out.print("Enter Name: ");
	   name = S.nextLine();

	   System.out.print("Press F for Full Time or P for Part Time: ");
	   a = S.nextLine().charAt(a);
	 
	   switch(a) {
	   case 'F':
		   Full.setMonthlySalary(name);
	   break;
	   case 'P':
		   Part.setWage(name);
	   break;
	   }
	}
	
	public String getName() {
		return name;
	}	
}