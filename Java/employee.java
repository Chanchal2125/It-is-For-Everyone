import java.io.*;
class employee
{
	String name;
	float bs;
	void getdata(String n,float b)
	{
		name=n;
		bs=b;
	}
	void putdata()
	{
		System.out.print("\nName\t|\tBasic_Salary\n"+name+"\t|\t"+bs);
	}
	public static void main(String args[])throws Exception
	{
		DataInputStream dis=new DataInputStream(System.in);
		System.out.print("Enter employee name : ");
		String s=dis.readLine();
		System.out.print("Enter basic salary  : ");
		float f=Float.parseFloat(dis.readLine());
		employee e=new employee();
		e.getdata(s,f);
		e.putdata();
	}
}
