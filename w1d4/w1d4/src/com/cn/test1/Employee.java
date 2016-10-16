package com.cn.test1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	public Account getSavingsAcct() {
		return savingsAcct;
	}

	public void setSavingsAcct(Account savingsAcct) {
		this.savingsAcct = savingsAcct;
	}

	public Account getCheckingAcct() {
		return checkingAcct;
	}

	public void setCheckingAcct(Account checkingAcct) {
		this.checkingAcct = checkingAcct;
	}

	public Account getRetirementAcct() {
		return retirementAcct;
	}

	public void setRetirementAcct(Account retirementAcct) {
		this.retirementAcct = retirementAcct;
	}
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
			savingsAcct=new Account(this, AccountType.CHECKING,startAmount);
	}
	public void createNewSavings(double startAmount) {
		// implement
			checkingAcct=new Account(this,AccountType.SAVING,startAmount);
	}
	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct=new Account(this,AccountType.RETIRENMENT,startAmount);
	}

	public void deposit(AccountType acctType, double amt){
		// implement
		if (acctType.equals(AccountType.CHECKING)){
			checkingAcct.makeDeposit(amt);
		}else if (acctType.equals(AccountType.SAVING)) {
			savingsAcct.makeDeposit(amt);
		}else {
			retirementAcct.makeDeposit(amt);
		}
	}
	public boolean withdraw(AccountType acctType, double amt){
		// implement
		boolean result;
		if(acctType.equals(AccountType.CHECKING)){
			result=checkingAcct.makeWithdrawal(amt);
			
		}else if (acctType.equals(AccountType.SAVING)) {
			result=checkingAcct.makeWithdrawal(amt);
		}else {
			result=retirementAcct.makeWithdrawal(amt);
		}
		return result;
	}

	public String getFormattedAcctInfo() {
		// implement
		String str="";
		if(checkingAcct!=null){
			str+=checkingAcct.toString();
		}else if (savingsAcct!=null) {
			str+=savingsAcct.toString();
		}else if (retirementAcct!=null) {
			str+=retirementAcct.toString();
		}
		return str;
	}	
	public String getter(){
		return ""+this.name+this.hireDate;
	}
}
