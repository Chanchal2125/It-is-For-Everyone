import java.io.*;
class arithmetic
{
public static void main(String args[])
{
	/*
	int a=25, b=19;
	float x=3.9f, y=9.8F;
	*/
	try
	{
	int a,b;
	float x,y;
	DataInputStream dis=new DataInputStream(System.in);
	System.out.print("Enter value of a : ");
	a=Integer.parseInt(dis.readLine());
	System.out.print("Enter value of b : ");
	b=Integer.parseInt(dis.readLine());
	System.out.print("Enter value of x : ");
	x=Float.parseFloat(dis.readLine());
	System.out.print("Enter value of y : ");
	y=Float.parseFloat(dis.readLine());
	
	System.out.println("\nAddition integer       : "+ (a+b));
	System.out.println("Addition float         : "+ (x+y));
	System.out.println("Addition mixed         : "+ (a+x));
	System.out.println("Subtraction integer    : "+ (a-b));
	System.out.println("Subtraction float      : "+ (x-y));
	System.out.println("Subtraction mixed      : "+ (a-x));
	System.out.println("Multiplication integer : "+ (a*b));
	System.out.println("Multiplication float   : "+ (x*y));
	System.out.println("Multiplication mixed   : "+ (a*x));
	System.out.println("Division integer       : "+ (a/b));
	System.out.println("Division float         : "+ (x/y));
	System.out.println("Division mixed         : "+ (a/x));
	System.out.println("Modulus integer        : "+ (a%b));
	System.out.println("Modulus float          : "+ (x%y));
	System.out.println("Modulus mixed          : "+ (a%x));
	}
	catch(Exception error)
	{
		System.out.print(error);
	}
}
}