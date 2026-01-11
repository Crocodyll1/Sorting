public class secondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {2,5,6,78,3,57,8,7};
        int n = arr.length;
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;

        for(int i =1; i<n; i++){
            if(arr[i] < smallest){
                sSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] != smallest && arr[i] < sSmallest){
                sSmallest = arr[i];
            }

        }
        System.out.println(sSmallest);
    }
}
