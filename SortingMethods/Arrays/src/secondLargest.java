public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {2,5,6,78,3,57,8,2};
        int n = arr.length;
        int largest = arr[0];
        int sLargest = -1;

        for(int i =0; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > sLargest){
                sLargest = arr[i];
            }

        }
        System.out.println(sLargest);
    }
}
