public class SelectionSort {
    public static void main(String[] args) {

        int[] nums = {2,4,2,7,8,22,77,81,73,23,1,8,21};
        int n = nums.length;

        for(int i =0; i< n-1; i++){
            int min = i;
            for(int j =i; j<n; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            int temp = nums[min];
            nums[min] =nums[i];
            nums[i] = temp;
        }
        System.out.print("Selection Sort : ");
        for(int i = 0; i<n; i++){
            System.out.print(nums[i] + " ");
        }
    }

}
