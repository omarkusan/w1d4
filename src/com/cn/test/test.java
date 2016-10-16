package com.cn.test;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class test {
	public static void main(String[] args) {
		NumberFormat format = new DecimalFormat("#.##");
		Employee employee = new Employee("Omar", 100000, 2016, 10, 1);
		System.out.println(employee.getName() + "," + employee.getSalary() + ",\n" + employee.getHireDay() + ",tax:"
				+ format.format(employee.yearlyFederalTax()));
		Account account = new Account(employee, "savings", 1000000);
		System.out.println("AccountType is:"+account.getaccType()+",balance is:"+account.getBalance()+",interest is:"+account.computeInterest());
	}
}
