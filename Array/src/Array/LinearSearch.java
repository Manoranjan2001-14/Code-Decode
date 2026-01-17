package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 76, 90, 23};
        int target = 12;
        boolean flag = false;

        for(int i=0; i<arr.length; i++){
            if (arr[i] == target){
                flag = true;
                break;
            }
        }
        if (flag == true){
            System.out.println(target+":exist");
        }else {
            System.out.println("Target not found");
        }
    }
}
