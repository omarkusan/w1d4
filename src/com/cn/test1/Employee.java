package com.cn.test1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private Date hireDate;
	
	public Employee(String name, int yearOfHire, 
int monthOfHire, int dayOfHire){
		this.name = name;
		GregorianCalendar cal = 
new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
	}

	public void createNewChecking(double startAmount) {
		// implement
		
	}
	public void createNewSavings(double startAmount) {
		// implement
		
	}
	public void createNewRetirement(double startAmount) {
		// implement
		
	}

	public void deposit(AccountType acctType, double amt){
		// implement
	}
	public boolean withdraw(AccountType acctType, double amt){
		// implement
	}

	public String getFormattedAcctInfo() {
		// implement
		return null;
	}

}
