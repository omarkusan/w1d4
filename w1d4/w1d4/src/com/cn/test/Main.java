package com.cn.test;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat format = new DecimalFormat("#.##");
		Employee employee=new Employee("Omar",120000,2017,6,1);
		Account account1=new Account(employee, "checking",300);
		Account account2=new Account(employee, "savings", 300);
		Account account3=new Account(employee, "retirement",300);
		System.out.println(employee.getName() + "," + employee.getSalary() + ",\n" + employee.getHireDay() + ",tax:"
				+ format.format(employee.yearlyFederalTax()));
		System.out.println(account1.toString()+",interest:"+account1.computeInterest());
		System.out.println(account2.toString()+",interest:"+account2.computeInterest());
		System.out.println(account3.toString()+",interest:"+account3.computeInterest());
		
	}

}
