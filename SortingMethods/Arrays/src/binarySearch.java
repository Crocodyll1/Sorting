import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter sorted array elements : "); // user should enter sorted array.
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target : ");
        int target = sc.nextInt();

        System.out.println();
        System.out.print("Target is at index : ");
        System.out.println(bSearch(arr,target));


    }
    public static int bSearch(int[] nums, int target){

        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high -low) / 2;
            if (nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}

/* Binary Search
1.Take mid element
2.Compare with target
3.Search left half or right half
4.Repeat until found
TC - O(log N)

Note- Array should be sorted, Divide and Conquer Method and faster than linear search
 */
