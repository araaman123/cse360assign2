/*
Ankith Raaman

Class ID: 529

Assignment # 2

Using version control systems
 */
package cse360assign2;


public class Calculator {

	private int total;
	
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () //method to access total
	{
		return total;
	}
	
	public void add (int value) //add function
	{
		total=total+value;
	}
	
	public void subtract (int value) //subtract function
	{
		total=total-value;
	}
	
	public void multiply (int value) //multiply function
	{
		total=total*value;
	}
	
	public void divide (int value) //divide function
	{
		if(value==0)
		{
			total=0;
		}
		total=total/value;
	}
	
	public String getHistory () //function to get history of actions
	{
		return "";
	}

}
