import java.util.*;
class calculator
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operation you want to perform");
        System.out.print("+ for addition \n - for subtraction \n * for multiplication \n /for division \n %for modulus ");
        char ch =sc.next().charAt(0);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        if(ch=='+')
        {
            System.out.println(a+b);
        }
        else if(ch=='-')
        {
            System.out.println(a-b);
        }
        else if(ch=='*')
        {
             System.out.println(a*b);
        }
        else if(ch=='/')
        {
             System.out.println(a/b);
        }
        else if(ch=='%')
        {
             System.out.println(a%b);
        }
        else
        {
             System.out.println("Invalid Choice");
        }
       
    }
}
