/*if the sum of its digits recursively is calculated till a single digit. If the single digit is 1 then the number is called a magic number. */

import java.util.*;

class MagicNumberChecking{
    static int CheckForMagic(int n){
        if(n<9)return n;
        int ans=0;
        while(n!=0){
            ans+=n%10;
            n/=10;
        }
        n=ans;
        return CheckForMagic(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check : ");
        int n=sc.nextInt();
        if(CheckForMagic(n)==1){
            System.out.println(n+" is Magic Number");
        }
        else System.out.println(n+" is not Magic Number");
        sc.close();
    }
}
/*
OUTPUT
Enter the number to check : 
1234
1234 is Magic Number

output-2
Enter the number to check : 
56
56 is not Magic Number
*/