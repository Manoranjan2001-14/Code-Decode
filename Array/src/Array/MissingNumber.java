package Array;

class MissingNumber {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 5};
        System.out.println(missingNum(arr));
    }
   static int missingNum(int arr[]) {
        long len = arr.length+1;
        long sum1 = 0;
        
        for(int i=0; i<arr.length; i++){
            sum1 += arr[i];
        }
        long sum2 = len * (len+1)/2;
        return (int) (sum2 - sum1);
    }
}