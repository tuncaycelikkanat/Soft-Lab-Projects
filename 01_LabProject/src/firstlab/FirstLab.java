
package firstlab;

import java.util.Scanner;

public class FirstLab {

    public static void main(String[] args) {
        
        Scanner keyb = new Scanner(System.in);
        
        System.out.print("Please enter hourly wage: ");
        double hourlyWage = keyb.nextDouble();
        
        System.out.print("Please enter weekly working hours: ");
        int workingHours = keyb.nextInt();
        
        System.out.print("Please enter weekly overtime hours(if you did): ");
        int weeklyOvertimeHours = keyb.nextInt();
        
        double montlySalary = ((workingHours + weeklyOvertimeHours) * hourlyWage) * 4;
        System.out.println("");
        
        System.out.printf("Hourly Wage: %.2f\n"
                + "Weekly Working Hours: %d\n"
                + "Weekly Overtime Hours: %d\n",hourlyWage,workingHours,weeklyOvertimeHours);
        System.out.println("");
        System.out.printf("Gross salary: %.2f" , montlySalary);
        System.out.println("");
        
        double tax = 0.05;
        double insureTax = 0.15;
        
        double netSalary = montlySalary - (montlySalary * (tax + insureTax));
        
        netSalary = Math.round(netSalary);
        
        System.out.printf(
                "\nTotal deduction amount: %.2f\n"
                + "\nNet salary: %.2f",montlySalary - netSalary,netSalary);
        System.out.println("");        
    }
}
