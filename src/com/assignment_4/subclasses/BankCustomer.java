/***
* subclass - Exercise 1/Assignment 4. 20161003
* @author: Laxmana Thapa
* @version: 1.0
**/

package com.assignment_4.subclasses;
import java.util.ArrayList;
import com.assignment_4.superclasses.Human;
import com.assignment_4.superclasses.BankAccount;

public class BankCustomer extends  Human  {
	/* Attribute of Class
	 * 
	 */
	ArrayList<BankAccount> customerAccounts= new ArrayList<BankAccount>();
	
	
	/* Constructor for class BankCustomer
	 * 
	 */
		public BankCustomer(String name, int age) {
			super(name, age);
		}
	
	/*Getters and Setters for attribute
	 * 
	 */
		
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}
	public void setcustomerAccounts(ArrayList<BankAccount> customerAccounts){
		this.customerAccounts= customerAccounts;
	}
	
	/* Methods for adding amount to the Account
	 * 
	 */
	public void addAccount(BankAccount bankAccount) {
		customerAccounts.add(bankAccount);	
	}
	
	/*methods for depositing 
	 * 
	 */
	public void depositToAccount(String accountNumber, double amount){
		for(int i=0;i<customerAccounts.size();i++){
			if(customerAccounts.get(i).getAccountNumber().equals(accountNumber)){
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	}
	 /* Methods for withdrawing amount
	  * 
	  */
	public void withdrawFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}

	/*Methods for returning string for Account details
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
		public String toString(){
			StringBuilder returnString = new StringBuilder();// Constructs a string builder 
		//	with no characters in it and we can use methods such as append
			
			returnString.append("Customer: " + getName() + "   Age: " + getAge() + "\n");
			for (int i = 0; i < customerAccounts.size(); i++)
				returnString.append(customerAccounts.get(i).toString() + "\n");
				
			return returnString.toString();
			
			
		}
}
