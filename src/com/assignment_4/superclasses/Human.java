/***
* superclass - Exercise 1/Assignment 4. 20160930
* @author: Laxmana Thapa
* @version: 1.0
**/
package com.assignment_4.superclasses;
public class Human {
	/*Attributes for the class
	 * 
	 */
	protected String name;
	protected int age;

	/* Constructor for the class
	 * 
	 */
	public Human(String name,int age) {
		super();
		this.name = name;
		this.age = age;

	}

	// Setters and Getters


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
