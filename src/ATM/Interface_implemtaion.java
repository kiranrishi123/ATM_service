package ATM;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Interface_implemtaion implements ATM_Interface
{
	ATM atm=new ATM();
	 Map<Double, String> minist=new HashMap<>();
	 
	@Override
	public void viweBalance() 
	{
		System.out.println("Available Balance:-"+" "+atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) 
	{
		if(withdrawAmount>=atm.getBalance())
		{
			System.out.println("Insufficent Balance");
		}
		else
		{
			if(withdrawAmount<=atm.getBalance())
			{
				System.out.println("Collect The Cash"+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				minist.put(withdrawAmount, "Amount Withdrawl SucessFully");
				viweBalance();
				
			}
		}
		
	}

	@Override
	public void deposteAmount(double depositeAmount) {
		System.out.println("depositeAmount"+depositeAmount);
		atm.setBalance(atm.getBalance()+depositeAmount);
		System.out.println();
		minist.put(depositeAmount, "Deposited Sucessfully");
		viweBalance();
	}

	@Override
	public void viewMiniStatemnt() {
		Set<Double> set=minist.keySet();
		for(double d:set)
		{
			System.out.println(d+"="+minist.get(d));
		}
		
	}
	

}
