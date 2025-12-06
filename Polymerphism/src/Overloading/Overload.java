package Overloading;

public class Overload {
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Overload calc = new Overload();
        System.out.println(calc.add(5, 4));
        System.out.println(calc.add(5.0, 6.0));
        System.out.println(calc.add(10, 34, 56));
    }
}
