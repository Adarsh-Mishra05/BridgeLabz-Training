import java.util.*;
public class EmployeeBonusCalculator {

    public static void main(String[] args) {

        // generate salary & service years
        double[][] employeeData = generateEmployeeData(10);

        // calculate bonus & new salary
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);

        // display result
        displaySalaryTable(employeeData, updatedData);
    }

    // generate salary and years
    public static double[][] generateEmployeeData(int size) {

        double[][] data = new double[size][2]; // salary, service

        for (int i = 0; i < size; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // salary
            data[i][1] = (int)(Math.random() * 11); // years
        }
        return data;
    }

    // calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(double[][] data) {

        double[][] updated = new double[data.length][2]; 

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            int years = (int) data[i][1];

            // bonus rule
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;

            updated[i][0] = bonus;
            updated[i][1] = salary + bonus;
        }
        return updated;
    }

   // display table in simple way
public static void displaySalaryTable(double[][] oldData, double[][] newData) {

    double totalOld = 0, totalNew = 0, totalBonus = 0;

    System.out.println("Employee Salary Details");
    
    for (int i = 0; i < oldData.length; i++) {

        double oldSalary = oldData[i][0];
        int years = (int) oldData[i][1];
        double bonus = newData[i][0];
        double newSalary = newData[i][1];
        
        // Display of Results
        System.out.println("Employee Number : " + (i + 1));
        System.out.println("Old Salary      : " + oldSalary);
        System.out.println("Years of Service: " + years);
        System.out.println("Bonus Amount    : " + bonus);
        System.out.println("New Salary      : " + newSalary);
        
        totalOld += oldSalary;
        totalBonus += bonus;
        totalNew += newSalary;
    }

    System.out.println("Final Totals");
    System.out.println("Total Old Salary : " + totalOld);
    System.out.println("Total Bonus      : " + totalBonus);
    System.out.println("Total New Salary : " + totalNew);
}