import java.util.Scanner;

public class removeElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter Array elements : ");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter val number to be remove : ");
        int val = sc.nextInt();

        int x = 0; // using one indexing for storing new array//
        for(int i =0; i<n; i++){
            if(arr[i] != val){
                arr[x++] = arr[i];

            }

        }
//        here it prints the size of new array
        System.out.print("The size of new array after removing val from entire array : ");
        System.out.println(x);
    }

}



/* here not only 1 element(val) is removed but the element(val) is removed is from entire array
  and returns the size of new array after removing val.
 */