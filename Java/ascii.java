class ascii
{
	public static void main(String args[])
	{
		char ch='a';
		int i=ch;
		System.out.println("ASCII value of "+ch+" is "+i);
		int cast=(int) ch;//typecasting widening
		System.out.println("ASCII value of "+ch+" is "+cast);
	}
}