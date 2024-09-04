package ATM;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Users_Data userData=new Users_Data();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String UserName=sc.nextLine();
		System.out.println("Enter your ATM_Number");
		Double user_atmNumber=sc.nextDouble();
		System.out.println("Enter your ATM_pIN");
		Double user_atmPIN=sc.nextDouble();
		
		
		
		userData.addUser(new User(UserName, user_atmNumber, user_atmPIN));
		
		User retrive_user=userData.getUsersByATMNumbres(user_atmNumber);
		
		if(retrive_user!=null)
		{
			System.out.println(retrive_user);
		}
		else
		{
			System.out.println("User not found");
		}
		
		
	}

}
