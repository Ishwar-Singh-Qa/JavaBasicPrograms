package java_basic_programming;

public class Constructor_Overloading 
{
	
	Constructor_Overloading()
	{
		System.out.println("Non Para Constructor");
	}
	
	Constructor_Overloading(int age, char gender)
	{
		System.out.println("Parameterized Constructor");
	}
	
	Constructor_Overloading(int x, double y)
	{
		System.out.println("sum=" + (x+y));
	}

	public static void main(String[] args) 
	{
		
		new	Constructor_Overloading();
		new	Constructor_Overloading(10,12.5);
		new	Constructor_Overloading(28,'M');

	}

}
