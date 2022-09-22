package com.InheritanceInterface.pll;

import com.InheritanceInterface.bll.BankAccount;
import com.InheritanceInterface.bll.BusinessAccount;
import com.InheritanceInterface.bll.CurrentAccount;
import com.InheritanceInterface.bll.SalaryAccount;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount acc1 = null;
		// reference of BankAccount
		System.out.println("***************Salary Account********************");
		
		acc1 = new SalaryAccount(15000);//Set Balance for Salary Account
		
		System.out.println("Balance: " + acc1.getBalance());
		
		acc1.deposit(3000);//depositing amount
		
		System.out.println("After depositing the balance: " + acc1.getBalance());//balance after depositing
		
		if(acc1.withdraw(10000)) {//withdrawing amount
			System.out.println("Withdrawal happened successfully.");
		}
		else {
			System.out.println("Insufficient balance.");
		}
		
		System.out.println("After withdrawing the balance: " + acc1.getBalance());//balance after withdrawal
		
		
		
	
		
		System.out.println("****************Saving Account*******************");
		
		acc1 = new CurrentAccount(45000);//balance set
		
		
		System.out.println("Balance: " + acc1.getBalance());
		
		acc1.deposit(10000);//depositing amount
		
		System.out.println("After depositing the balance: " + acc1.getBalance());//balance after depositing
		
		if(acc1.withdraw(20000)) { //withdrawing amount
			System.out.println("Withdrawal happened successfully.");
		}
		else {
			System.out.println("Insufficient balance.");
		}
		
		System.out.println("After withdrawing the balance: " + acc1.getBalance());//balance after withdrawal
		
		
		
		System.out.println("**************Business Account*********************");
		
		acc1 = new BusinessAccount(150000);//set balance
	
		
		System.out.println("Balance: " + acc1.getBalance());
		
		acc1.deposit(15000);//depositing amount
		
		System.out.println("After depositing the balance: " + acc1.getBalance());//balance after depositing
		
		
		if(acc1.withdraw(25000)) { //withdrawing amount
			System.out.println("Withdrawal happened successfully.");
		}
		else {
			System.out.println("Insufficient balance.");
		}
		
		System.out.println("After withdrawing the balance: " + acc1.getBalance());//balance after withdrawal

	}

}
