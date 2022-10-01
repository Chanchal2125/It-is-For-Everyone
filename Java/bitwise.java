class bitwise
{
public static void main(String args[])
{
	int a=15,b=-18,c=10,d=9;
	c=a & c;//10
	System.out.println("&   = " +c);
	c=a & c | d ^ a;
	System.out.println("|   = " +c);
	a=a | c;//15
	System.out.println("|   = " +a);
	c=d ^ a;//6
	System.out.println("^   = " +c);
	System.out.println("~   = " +(~b)); //2's complement -> -18 ... 1st complement  
	a=15;
	c=10;
	System.out.println("<<  = " +(a<<2));//60
	System.out.println(">>  = " +(c>>2));//2
	System.out.println(">>> = " +(b>>>3));//
	System.out.println(">>  = " +(-18>>3));
	b=12;
	System.out.println(">>  = " +(b>>3));//1
	System.out.println("<<  = " +(b<<3));//96
	System.out.println(">>  = " +(51>>3));//6(divide '3' times to 51 by 2)
	System.out.println("<<  = " +(51<<3));//408(multiply '3' times to 51 by 2)
}
}
//Bitwise operators always return an integer value in java,c & c++.