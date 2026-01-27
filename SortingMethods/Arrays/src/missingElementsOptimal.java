public class missingElementsOptimal {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int n = arr.length + 1; // or n = max value from array

        int sum = (n*(n+1))/2;
        int s2 = 0;

        for(int val : arr){
            s2 += val;
        }
        System.out.print("missing Element from array : " );
        System.out.println( sum - s2);
    }
}

/* Missing Element from array Optimal approach 1
 In this method we calculated the total sum of n(max value present in array or
  arr.length +1 array and substracted from the sum to get the missing number.
  TC= O(N)
  SC = O(1)
 */
