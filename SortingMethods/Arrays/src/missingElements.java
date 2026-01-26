public class missingElements {
    public static void main(String[] args) {

        int[] arr = {1,3,4,5,6,7};
        int n = arr.length;

        for(int i= 1; i<=n; i++){
            int flag = 0;
            for (int j=0; j<n; j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag ==0){
                System.out.println(i);;
            }
        }

    }
}


/* missing Elements from Array(Bruteforce)
Worst TC- o(N*N)
SC- O(1)

 */