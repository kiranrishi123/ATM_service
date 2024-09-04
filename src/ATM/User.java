package ATM;

public class User
{
	private String name;
	private Double atmNumber;
	private Double atmPIN;
	
	public User(String name, Double atmNumber, Double atmPIN)
	{
		this.name=name;
		this.atmNumber=atmNumber;
		this.atmPIN=atmPIN;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAtmNumber() {
		return atmNumber;
	}

	public void setAtmNumber(Double atmNumber) {
		this.atmNumber = atmNumber;
	}

	public Double getAtmPIN() {
		return atmPIN;
	}

	public void setAtmPIN(Double atmPIN) {
		this.atmPIN = atmPIN;
	}

	  @Override
	    public String toString() {
	        return "User [Name=" + name + ", ATM Number=" + atmNumber + ", ATM PIN=" + atmPIN + "]";
	    }
	
	
	
	
	
	
	

}
