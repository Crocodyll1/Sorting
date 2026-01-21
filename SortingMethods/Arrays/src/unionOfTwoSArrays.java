import java.util.HashSet;
import java.util.Set;

public class unionOfTwoSArrays {
    public static void main(String[] args) {

        int[] arr1= {1,2,3,5,7,8};
        int[] arr2 = { 3,4,5,6,7,8,9};
        int n1 = arr1.length;
        int n2 = arr2.length;


        Set<Integer> set = new HashSet<>();

        for(int i =0; i<n1; i++){
            set.add(arr1[i]);
        }
        for(int i =0; i<n2; i++){
            set.add(arr2[i]);
        }
        int[] union = new int[set.size()];

        int i =0;
        for(int val : set){
            union[i++] = val;
        }

        int j =0;
        for(int val : union){
            System.out.print(val + " ");
        }
    }
}


/* Bruteforce Method
Union of two sorted arrays

TC : O(n1 log n + n2 log n) + O(n1 + n2)
SC : O(n1 + n2) + O(n1 + n2)
                       |
                       |
                       V
                   Just to display union
 */
