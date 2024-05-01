package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    private static final ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args)
    {
        loadEmployees();
        //System.out.print("There are " + employee.size)
        displayAllEmployeesInfo();

    }


    public static void loadEmployees()
    {
        File file = new File ("files/Employee.csv");
        try(Scanner fileScanner = new Scanner(file))
        {
            // skips the first line
            fileScanner.nextLine();

            String line = fileScanner.nextLine();

            String[] colums = line.split("[|]");

            String id = colums[0];
            String name = colums[1];
            double hoursWorked = Double.parseDouble(colums[2]);
            double payRate = Double.parseDouble(colums[3]);

            Employee employee = new Employee(id, name, hoursWorked, payRate);
           // employees.

        }
        catch (FileNotFoundException ex)
        {

        } catch (Exception ex)
        {

        }
    }
    public static void displayAllEmployeesInfo(){
        System.out.println();
        System.out.println("All Employees");
        System.out.println("-".repeat(70));
        for (Employee employee : employees)
        {
            printEmployee(employee);

        }
    }

    private static void printEmployee(Employee employee)
    {
        System.out.printf("%s %s %2f %2f", employee.getId(), employee.getName(), employee.getHoursWorked(),employee.getPayRate());
    }


}

