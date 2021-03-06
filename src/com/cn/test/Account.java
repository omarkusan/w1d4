package com.cn.test;

public class Account {
	public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private String acctType;
	private Employee employee;

	Account(Employee emp, String acctType, double balance){
	employee = emp;
	this.acctType =acctType;
	this.balance = balance;
	}
	public String getaccType(){
		return this.acctType;
	}
	public double getBalance(){
		return this.balance;
	}
	Account(Employee emp, String acctType){
	this(emp,acctType,DEFAULT_BALANCE);
	}
	public String toString() {
	return "type = "+acctType+", balance = "+balance;
	}
	public void makeDeposit(double deposit) {
		this.balance+=deposit;
	}
	public boolean makeWithdrawal(double amount) {
		
		if(this.balance>amount){
			this.balance-=amount;

			return true;
		}
		return false;
	}
	public double computeInterest(){
		double interest=0;
		if(this.acctType.equals("checking")){
			interest=this.balance*0.02;
		}else if (this.acctType.equals("savings")) {
			interest=this.balance*0.04;
		}else {
			interest=this.balance*0.05;
		}
		return interest;
	}
	

}
