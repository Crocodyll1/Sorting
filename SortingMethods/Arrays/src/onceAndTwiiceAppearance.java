public class onceAndTwiiceAppearance {
    public static void main(String[] args) {
        int[] arr= {1,1,2,3,3,4,4,5,5};
        int n = arr.length;

        for(int i =0; i<n; i++){
           int num = arr[i];
           int count = 0;
           for(int j =0; j<n; j++){
               if(arr[j] == num){
                   count++;

               }
           }
           if(count == 1){
               System.out.println("The number that appears only once is : "+num);
           }

        }
    }
}

/* finding the number that appears once and other appear twice
TC = O(N^2)
SC = O(1)
 */
