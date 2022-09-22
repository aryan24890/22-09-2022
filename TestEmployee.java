package com.InheritanceInterface.pll;

import com.InheritanceInterface.bll.HourlyEmployee;
import com.InheritanceInterface.bll.SalaryEmployee;

public class TestEmployee {

	public static void main(String[] args) {
		SalaryEmployee s1 =new SalaryEmployee("Dibyanshu", "Developer",25000);
		
		HourlyEmployee h1=new HourlyEmployee("Rocky","Accountent",600,8);
		
		System.out.println(s1);
		System.out.println(h1);

	}

}
