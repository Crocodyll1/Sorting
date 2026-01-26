
public class missingElementsB {
    public static void main(String[] args) {

        int[] arr = {1,3,4,5,6,7};
        int n = arr.length;

        int[] hash = new int[n+2];

        for(int i =0; i<n; i++){
            hash[arr[i]] += 1;

        }
        for(int i =0; i<=n+1; i++){
            if(hash[i] == 0){
                System.out.println("Missing number : "+i);
            }
        }


    }
}
/* Missing Elements from Array(Better Method)
TC - O(N) + O(N) = O(2N)
SC- O(N)
 */