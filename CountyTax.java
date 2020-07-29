
public class CountyTax 
{
	private double tax;
	private String County;
	
	public CountyTax()
	{
		tax=0;
		County="";
	}
	
	public CountyTax(double newTax, String newCounty)
	{
		tax=newTax;
		County=newCounty;
	}
	
	public void setTax(double newTax)
	{
		tax = newTax;
	}
	
	public void setCounty(String newCounty)
	{
		County = newCounty;
	}
	
	public double getTax()
	{
		return tax;
	}
	
	public String getCounty()
	{
		return County;
	}
	
}
