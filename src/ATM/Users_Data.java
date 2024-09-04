package ATM;

import java.util.ArrayList;
import java.util.List;

public class Users_Data
{
	List<User> users= new ArrayList<>();
	
	public void addUser(User user)
	{
		users.add(user);
	
	}
	
	public User getUsersByATMNumbres(Double atmNumber)
	{
		for(User user: users)
		{
			if (user.getAtmNumber()==atmNumber)
			{
				return user;
			}
		}
		return null;
	}

}
