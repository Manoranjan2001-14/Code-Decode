public class StaticMethod {
    static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        int ans = StaticMethod.add(10, 20);
        System.out.println(ans);
    }
}
