import java.util.Scanner;

public class RecursiveBinarySearch {
    // A recursive binary search function. It returns location of x in
    // given array arr[l..r] is present, otherwise -1
    static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then it can only be present
            // in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present in array
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n = sc.nextInt();
        System.out.println("Enter the array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        System.out.println("Enter the element to be searched");
        int target = sc.nextInt();
        int ans = binarySearch(arr, 0, n-1, target);

        System.out.println("Element found at index : "+ans);

    }
}

/*
Enter the number of array elements
5
Enter the array elements
5 8 9 10 7
Enter the element to be searched
10 
Element found at index : 3
*/