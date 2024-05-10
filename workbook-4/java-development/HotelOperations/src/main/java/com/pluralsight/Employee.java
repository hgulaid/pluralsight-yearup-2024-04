package com.pluralsight;

public class Employee {
private double overTime =  1.5;
    //private int employeeID;
    //private String name;
    //private String department;
    private double payRate;
    private double hoursWorked;
    //private boolean overTime;

    public Employee(double payRate, double hoursWorked) {
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    //public boolean isOverTime() {return overTime;}

    //public void setOverTime(boolean overTime) {this.overTime = overTime;}

    public double getPayRate() {return payRate;}
    public void setPayRate(double payRate){this.payRate = payRate;}

    public double getHoursWorked(){return hoursWorked;}
    public void setHoursWorked(double hoursWorked){this.hoursWorked = hoursWorked;}

    public double getRegularHours(){
        if (hoursWorked < 40){
            return hoursWorked;
        }else{
            return 40;
        }
    }

    public double getOverTime(){
        if (hoursWorked > 40){
            return hoursWorked - 40;
        }else {
            return 0;
        }

    }

    public double totalPay() {
        if (hoursWorked <= 40) {
            return getRegularHours() * payRate;
        } else {
            return getOverTime() * payRate * overTime + getRegularHours() * payRate;
        }
    }
}
