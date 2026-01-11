public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,2,9,77,88,23,54,32,76,11,1};
        int n = arr.length;
        for(int i=n-1; i>=1; i--){
            for(int j=0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Bubble Sorting : ");
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
