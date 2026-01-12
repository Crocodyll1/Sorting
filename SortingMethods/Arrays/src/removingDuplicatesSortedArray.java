public class removingDuplicatesSortedArray {
    public static void main(String[] args) {

        int[] arr={0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,7,7};
        int n = arr.length;

        int j =0;
        for(int i =0; i<n; i++){
            if(arr[j] != arr[i]){
                arr[++j] = arr[i];

            }

        }
        System.out.println("the length of final array after removing duplicates is : "+ (j+1));
    }
}
