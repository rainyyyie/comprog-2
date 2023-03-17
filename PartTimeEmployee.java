package Package;
import java.util.Scanner;

public class PartTimeEmployee {
double ratePerHour,wage;
	int hoursWorked;
	
	public void setWage(String employeeName) {
		
		Scanner S = new Scanner (System.in);
		System.out.print("Enter rate per hour and no. of hours worked separated by space: ");
		double ratePerHour = S.nextDouble();
		int hoursWorked = S.nextInt();
		double wage = ratePerHour * hoursWorked;
		
		System.out.println("Name: " + employeeName );
		System.out.print("wage:" + String.format("%.2f", wage));
	}
}