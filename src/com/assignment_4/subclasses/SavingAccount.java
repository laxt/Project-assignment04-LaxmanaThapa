/***
* subclass - Exercise 1/Assignment 4. 20160930
* @author: Laxmana Thapa
* @version: 1.0
**/
package com.assignment_4.subclasses;
import java.util.UUID;
import com.assignment_4.superclasses.BankAccount;

public class SavingAccount extends BankAccount {
/* Constructor only
 * 
 */
	public SavingAccount() {	
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Saving account");
	}
}
