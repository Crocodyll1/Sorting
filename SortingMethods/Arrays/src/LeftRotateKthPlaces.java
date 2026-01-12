import java.util.Scanner;

public class LeftRotateKthPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter Array elements : ");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter nth number to rotate : ");
        int k = sc.nextInt();

        reverse(arr,0,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);

        System.out.print("Array after place rotation :");

        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }


    }
    public static void reverse(int[] nums,int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
