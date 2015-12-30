package com.yash.presentation;

import java.util.List;
import java.util.Scanner;

import com.yash.dao.AccountDao;
import com.yash.dao.UserDao;
import com.yash.domain.Account;
import com.yash.domain.User;

public class Presentation {
	
	public static void accountAccess() {
		List<Account>list;
		Scanner sc=new Scanner(System.in);
		do{
			
			System.out.println("Enter 1. To Withdraw Amount");
			System.out.println("Enter 2. To Deposit Amount");
			System.out.println("Enter 3. To View Balance");
			System.out.println("Enter 4. To Transfer Amount");
			System.out.println("Enter 5. To Exit");
			
			int check=sc.nextInt();
					
				switch(check){
						case 1:{
							System.out.println("Enter your account id to withdraw amount");
							int accountid=sc.nextInt();
							
							System.out.println("Enter the amount you want to withdraw");
							int withdraw=sc.nextInt();
							
							AccountDao accountdao=new AccountDao();
							int a=accountdao.withdraw(accountid, withdraw);
							System.out.println("Now the amount is "+a);
							
							
						break;
						}
						case 2:{
							System.out.println("Enter your account id to withdraw amount");
							int accountid=sc.nextInt();
							
							System.out.println("Enter the amount you want to deposit");
							int deposit=sc.nextInt();
							
							AccountDao accountdao=new AccountDao();
							int a=accountdao.deposit(accountid, deposit);
							System.out.println("Now the amount is "+a);
							
						break;	
						}
						case 3:{
							System.out.println("Enter your account id to view balance");
							int accountid=sc.nextInt();
							
							AccountDao accountdao=new AccountDao();
							 list=accountdao.viewBalance(accountid);
							 for(Account account: list){
								 System.out.println(list);
							 }
						break;	
						}
						case 4:{
							System.out.println("Enter your account id");
							int accountid=sc.nextInt();
							
							System.out.println("Enter the id of the beneficiary you want to transfer amount to");
							int beneficiaryid=sc.nextInt();
							
							System.out.println("Enter the amount you want to transfer");
							int transferamount=sc.nextInt();
							
							AccountDao accountdao=new AccountDao();
							accountdao.transfer(accountid,beneficiaryid,transferamount);
							
							
						break;	
						}
						case 5:{
							System.exit(0);
						}
					}
			}
			while(true);
	}
	
	
	public static void main(String[] args) {
		int actcheck=0;
		Scanner scanner = new Scanner(System.in);
		
		do{
		System.out.println("1. Enter 1 to Log in");
		System.out.println("2. Enter 2 to SignUp");
		System.out.println("3. Enter 3 to exit");
		
		int choice=scanner.nextInt();
		
			switch(choice){
				case 1:{
					System.out.println("Enter your userid");
					String userid=scanner.next();
					
					System.out.println("Enter your password");
					String password=scanner.next();
					
					User user=new User();
					user.setUserid(userid);
					user.setPassword(password);
					
					UserDao userdao=new UserDao();
					actcheck=userdao.login(userid, password);
					String name= user.getName();
					System.out.println("Welcome"+name);
					
					if(actcheck==1){
						accountAccess();
					}
					else{
						System.out.println("Invalid User");
					}
				break;	
				}
				case 2:{
					System.out.println("Enter your name");
					String name=scanner.next();
					
					System.out.println("Enter your userid");
					String userid=scanner.next();
					
					System.out.println("Enter your password");
					String password=scanner.next();
					
					User user=new User();
					user.setName(name);
					user.setUserid(userid);
					user.setPassword(password);
					
					UserDao userdao=new UserDao();
					userdao.signup(user);
				break;
				}
				case 3:{
					System.exit(0);
				break;
				}
			}
		}
		while(true);
	}
}
