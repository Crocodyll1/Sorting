public class optimisedOnceAndTwiceAppear {
    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4,4,5,5};
        int result = 0;

        for(int val : arr){
            result ^= val;
        }

        System.out.println(result);
    }
}

/* here we used XOR for better TC and SC(optimised way)
TC = O(N)
SC = O(1)
 */