public class SmallestElement {
    public static void main(String[] args) {

        int[] arr= {25,67,1,4,63,89,100};
        int n = arr.length;
        int smallest = arr[0];

        for(int i =1; i<n; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}
