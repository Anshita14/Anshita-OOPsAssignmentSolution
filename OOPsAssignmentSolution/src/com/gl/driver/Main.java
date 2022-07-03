package com.gl.driver;

import com.gl.departments.AdminDepartment;
import com.gl.departments.HrDepartment;
import com.gl.departments.TechDepartment;

public class Main {

	public static void main(String[] args) {
		AdminDepartment admin = new AdminDepartment();
		TechDepartment tech = new TechDepartment();
		HrDepartment her = new HrDepartment();
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();
		
		System.out.println("Welcome to " + her.departmentName());
		System.out.println(her.doActivity());
		System.out.println(her.getTodaysWork());
		System.out.println(her.getWorkDeadline());
		System.out.println(her.isTodayAHoliday());
		System.out.println();
		
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());

	}

}
