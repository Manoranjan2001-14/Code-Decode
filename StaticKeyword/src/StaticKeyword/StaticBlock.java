package StaticKeyword;

public class StaticBlock {
    static int id;
    static {
        id = 10;
        System.out.println("Static block executed..");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed..");
        System.out.println(id);
    }
}
