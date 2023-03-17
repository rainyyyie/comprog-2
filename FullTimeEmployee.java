package Package;
import java.util.Scanner;

public class FullTimeEmployee {
double monthlySalary;
	
	public void setMonthlySalary(String employeeName) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Enter rate per day and no. of days worked separated by space:");
		double ratePerDay = s.nextDouble();
		double daysWorked = s.nextDouble();
		double wage = ratePerDay * daysWorked;
			
		System.out.println("Name: " + employeeName );
		System.out.print("wage:" + String.format("%.2f", wage));
	}
}