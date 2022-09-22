package com.inheritance.bll;

public class SalaryEmployee extends Employee {
	
 public double weeklySalary;
 
 public SalaryEmployee() {
	 super();
 }
 
 public SalaryEmployee(double weeklySalary, String name, String jobtitle) {
	 
	 super(name, jobtitle);
	 this.weeklySalary = weeklySalary;
 }
 
 public double getWeeklySalary() {
	 return weeklySalary;
 }
 
 public void setWeeklySalary(double weeklySalary) {
	 this.weeklySalary = weeklySalary;
 }
 public double calculatePay() {
	 return weeklySalary;
 }

	
}
