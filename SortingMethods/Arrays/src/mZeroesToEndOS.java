public class mZeroesToEndOS {
    public static void main(String[] args) {
        int[] arr = {2,5,0,2,6,0,1,0,4,0,0};
        int n = arr.length;

        int j =-1;
        for(int i =0; i<n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        for(int i = j+1; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        //for printing avoid loop and use method for better TC
        for(int val : arr){
            System.out.println(val + " ");
        }
    }
}

/*
TC(removing printing loop) = O(N)
 */