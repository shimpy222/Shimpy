package com.java;

class Employee {
	int age;

	public Employee(int age) {
		this.age = age;
	}

	public boolean isEligibleToWork() throws Exception {
		if (age > 18) {
			return true;
		} else {
			throw new Exception("age is smaller");
		}
	}
}

public class Vinay1 {

	public static void main(String[] args) {
		Employee emp = new Employee(15);

		try {

			if (emp.isEligibleToWork()) {
				System.out.println("eligible");
			}

		} catch (Exception ex)

		{
			System.out.println(ex);
		}

	}
}
