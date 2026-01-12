package condition;

public class FindLargestNum {
    public static void main(String[] args) {
        int a = 100; int b = 220; int c = 30;
        if(a > b && a > c){
            System.out.println(a+":is greater");
        } else if (b > a && b > c) {
            System.out.println(b+":is greater");
        }
        else {
            System.out.println(c+":is greater");
        }
    }
}
