import java.io.*;
class armstrong
{
	public static void main(String args[])throws Exception
	{
		DataInputStream dis=new DataInputStream(System.in);
		int n,s=0,r,d=0;
		System.out.print("Enter any Number : ");
		n=Integer.parseInt(dis.readLine());
		int m=n;
		if(n>=10 && n<=99)
			d=2;
		else if(n>=100 && n<=999)
			d=3;
		else if(n<=1000 && n>=9999)
			d=4;
		else if(n<=10000 && n>=99999)
			d=5;
		
		while(n>0)
		{
			r=n%10;
			s=s+(int)Math.pow(r,d);  
			n/=10; //n=n/10;
		}
		if(m==s)
			System.out.print(m + " is armstrong number.");
		else
			System.out.print(m + " is not armstrong number.");
	}
}