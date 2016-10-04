/***
* superclass - Exercise 1/Assignment 4. 20160930
* @author: Laxmana Thapa
* @version: 1.0
**/
package com.assignment_4.superclasses;
import java.util.UUID;
import com.assignment_4.interfaces.BankOperations;

public class BankAccount implements BankOperations {
	/*Attribute for the class
	 * 
	 */
	private String accountNumber = "";
	private double balance = 0;
	private String accountType = "";
	
	/* Constructor for class
	 * 
	 */
	public BankAccount() {	
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.balance = 0;
		this.accountType = "Bank account";
	}	
	
	/*Getters and Setters of the Attributes
	 * 
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	/* Methods for withdrawing money
	 * (non-Javadoc)
	 * @see com.assignment_4.interfaces.BankOperations#withdrawMoney(double)
	 */
	public void withdrawMoney(double amount) {
		if (amount>=0){
			setBalance(this.balance - amount);
		}else{
			System.out.println("You can not withdraw a negative value!");
		}
				
	}
	
	/* Methods for money deposit
	 * (non-Javadoc)
	 * @see com.assignment_4.interfaces.BankOperations#depositMoney(double)
	 */
	public void depositMoney(double amount) {
		if (amount>=0){
			setBalance(getBalance() + amount);
		}else{
			System.out.println("You can not deposit a negative value!");
		}
		
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", accountType=" + accountType + "]";
	}	
	
	
	
	
	

}


