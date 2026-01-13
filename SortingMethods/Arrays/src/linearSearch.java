import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter Array elements : ");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target number to be search : ");
        int target = sc.nextInt();

        System.out.println(linearSearch(arr,target));



    }
    public static int linearSearch(int[] arr, int target){
        int n = arr.length;
        for(int i =0; i<n; i++){
            if(arr[i] == target ){
                return i;
            }


        }
        return -1;
    }
}

/* Program for linear search :
 here there is a user entered array in which we have to return the index of target set by user;
 if the target is found it return the index else return -1 which shows target not found in array.

 */

