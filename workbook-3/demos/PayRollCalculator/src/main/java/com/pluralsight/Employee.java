package com.pluralsight;

public class Employee {
    String id = "";
    String name = "";
    double hoursWorked = 0;
    double payRate = 0;

    public Employee (String id, String name, double hoursWorked, double payRate) {
        this.id = id;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public double getHoursWorked ()
    {
        return hoursWorked;
    }
    public void setHoursWorked (double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
    public double getPayRate ()
    {
        return payRate;
    }
    public void setPayRate (double payRate)
    {
        this.payRate = payRate;
    }
    // create a method that calculates and returns employee gross pay
    public double calculateGrossPay(){
        return payRate * hoursWorked;
    }
}
