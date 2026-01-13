package multipleinheritance;

public class C implements A, B{
    public void show(){
        A.super.show();
        B.super.show();
    }
}
