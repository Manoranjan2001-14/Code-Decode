package StaticKeyword;

public class StaticNesterClass {
    static int x = 10;
    int y = 20;

    static class Inner{
        void show(){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        StaticNesterClass.Inner obj = new StaticNesterClass.Inner();
        obj.show();
    }
}
