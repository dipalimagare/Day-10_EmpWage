package com.bl;

import java.util.Random;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation program");
		checkAttendance();
	}

	public static void checkAttendance() {
		Random r = new Random();
		int empCheck = r.nextInt(2);
		switch (empCheck) {
		case 0: {
			System.out.println("Employee is present");
			break;
		}
		case 1: {
			System.out.println("Employee is absent");
			break;
		}
		}
	}
}
