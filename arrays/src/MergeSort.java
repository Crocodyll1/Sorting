public class MergeSort {
    public static void main(String[] args) {
        int[] arr={3,5,6,2,8,5,2,99,34,22,76};
        int n = arr.length;
        mergesort(arr,0,n-1);

        for(int num : arr){
            System.out.print(num + " ");
        }

    }
    public static void merge(int[] arr, int low,int mid, int high){
        int[] temp = new int[high - low +1];

        int left = low ;
        int right= mid +1;
        int x =0;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[x++] = arr[left++];
            }
            else{
                temp[x++] =arr[right++];
            }
        }
        while(left<= mid){
            temp[x++] = arr[left++];
        }
        while(right<= high){
            temp[x++] =arr[right++];
        }
        for(int i =0; i< temp.length; i++){
            arr[low +i] = temp[i];
        }

    }
    public static void mergesort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low + high)/2;
        mergesort(arr,low , mid);
        mergesort(arr, mid+1, high);
        merge(arr, low, mid , high);
    }
}
