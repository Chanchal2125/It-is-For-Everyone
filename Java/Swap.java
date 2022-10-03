import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        swap(n1,n2);
    }

    static void swap(int a, int b) {
        System.out.println("The original no. are: " + a + "," + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("The swapped no. are: " + a + "," + b);
    }
}
