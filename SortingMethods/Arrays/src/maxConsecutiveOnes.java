public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,1,0,1,1,1,1};
        int n = arr.length;

        int count = 0;
        int maxi = 0;
         for(int i =0; i<n; i++){
             if(arr[i] == 1){
                 count ++;
                 maxi = Math.max(maxi , count);
             }
             else{
                 count = 0;
             }
         }
        System.out.println(maxi);
    }
}


/* Here we used a simple approach for finding the maximum consecutive one
by Using Math.max() inbuild library to get the maximum ones,
approach - initialize count(counting no. of one) and maxi(store consecutive ones)
using for loop if n[i] == 1 increase count by 1 and max else set count = 0;
finally print maxi;

TC= O(N)
SC = O(1)
 */