package StringBuilder;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Manoranjan");
        sb.append("Behera");
        System.out.println(sb);
        System.out.println(sb.length()+" "+sb.capacity());
        sb.reverse();
        System.out.println(sb);
        sb.deleteCharAt(4);
        System.out.println(sb);
    }
}
