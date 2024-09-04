package ATM;

import java.util.Scanner;

public class user_UI 
{
	public static void main(String[] args) 
	{
		Users_Data userData=new Users_Data();
		
		Interface_implemtaion imp1=new Interface_implemtaion();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To the Bank Of Baroda");
		System.out.println();
		String user_Name="Rishi Kiran Lakkoju";
		String atmNumber="16270427";
		String atmPIN="0427";
		System.out.println("Enter Your ATM Number");
		String atmNumber_UI=sc.nextLine();
		System.out.println("Enter PIN Number");
		String atmPIN_UI=sc.nextLine();
		
		if(atmNumber.equals(atmNumber_UI) && atmPIN.equals(atmPIN_UI))
		{
				boolean d=true;
				
				while(d)
				{
					
						System.out.println();
						System.out.println();
						System.out.println("----------+"+"Welcome"+" "+user_Name+"----------");
						System.out.println();
						System.out.println("Please select any option below");
						System.out.println();
						System.out.println(" 1.viewBalance\n 2.withdrawalAmount\n 3.DepositeAmount\n 4.viewMiniStatemnt\n 5.Exit");
						int option=sc.nextInt();
						
						switch (option)
						{
							case 1:
							{
								imp1.viweBalance();	
								System.out.println();
								break;
							}
							case 2:
							{
								System.out.println("Enter Amount to withdrawl");
								double withdrawl=sc.nextDouble();
								imp1.withdrawAmount(withdrawl);
								break;
							}
							case 3:
							{
								System.out.println("Enter amount to Deposite");
								double deposite=sc.nextDouble();
								imp1.deposteAmount(deposite);
								break;
							}
							case 4:
							{
								imp1.viewMiniStatemnt();
								break;
							}
							case 5:
							{
								 d = false;
								 System.out.println("Thank you for using Bank Of Baroda ATM. Goodbye!");
			                     break;
								
							}
						
						}
						
						
				}
		}
		else
		{
			System.out.println("User Not Found");
		}
		
			
		
		
		
	}

}
