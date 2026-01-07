public class BubbleSortOptmised {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,4,5,6,7,8,9};
        int n = arr.length;
        int happen = 0;  //used to check if the array needs to be sorted or not
        for(int i=n-1; i>=1; i--){
            for(int j=0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    happen = 1;
                }
            }
            if( happen == 0){
                System.out.println("not happen");
                break;
            }else{
                System.out.println("happen ");
            }
        }
        System.out.print("Bubble Sorting : ");
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

/* happen is used to check is the loop is really working or not, if the array is already sorted
then there us no need to sort using loop.
if the array is already sorted then best time complexity of this code is O(N)
else worst time complexity = O(N^2)

 */
