import java.util.ArrayList;

public class moveZeroesToEndBF {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,2,0,2,90,0,0,0,1,0};
        int n = arr.length;

        ArrayList<Integer> temp = new ArrayList<>();
        for(int i =0; i<n; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }
        int index = 0;
        for(int val : temp){
            arr[index++] = val;
        }
        while(index < n){
            arr[index++] =0;

        }
        for(int num : arr ){
            System.out.print(num + " ");
        }

    }
}

/* this method is brutefore thats why it is taking many loops and array ,
TC = O(2N)
SC = O(X)
 */
