package com.cn.test;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	// instance fields
	private String name;
	private double salary;
	private Date hireDay;

	// constructor
	Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay =cal.getTime();
	}

	// instance methods
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	// needs to be improved!!
	public Date getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	public double yearlyFederalTax(){
		double yearlyfedraltax=0;
		if(this.salary>80000){
			yearlyfedraltax=this.salary*0.28;
		}else if (this.salary>50000 && this.salary<=80000) {
			yearlyfedraltax=this.salary*0.2;
		}else {
			yearlyfedraltax=0;
		}
		return yearlyfedraltax;
	}
}
