package com.inheritance.pll;


import com.inheritance.bll.Employee;
import com.inheritance.bll.HourlyEmployee;
import com.inheritance.bll.SalaryEmployee;

public class TestEmployee {

	public static void main(String[]  args) {
		
	    Employee emp1 = null;
		emp1 = new SalaryEmployee(800, "A.P.J. KALAM ", "Scientist ");
		System.out.println(emp1);
		
		System.out.println("Weekly Salary : " + emp1.calculatePay());
		
		System.out.println("****************************");
		
		emp1 = new HourlyEmployee(8, 2000, "ARBAJ", "Java Developer"); 
		
		System.out.println(emp1);
		System.out.println("Total Hourly Salary " + emp1.calculatePay());
	}
}
