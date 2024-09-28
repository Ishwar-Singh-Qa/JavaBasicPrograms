package java_basic_programming;

public class Constructor_Calling_Parameterized 
{
	
	Constructor_Calling_Parameterized(int a)
	{
		System.out.println("I am a Parameterized Constructor");
	}

	public static void main(String[] args) 
	{
	//new Constructor_Calling_Parameterized();//It gives complier ERROR since there is only one single constructor with parameter
		
		new Constructor_Calling_Parameterized(101);  //NOW CONSTRUCTOR WILL BE CALLED
	}

}
