package Array;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2001);
        al.add(14);
        al.add(23);
        al.add(30);
//        System.out.println(al.get(0));
//        System.out.println(al.set(2, 99));
//        System.out.println(al.size());

//        for(int i=0; i<al.size(); i++){
//            System.out.print(al.get(i)+" ");
//        }
//        for(int ans : al){
//            System.out.println(ans);
//        }

       // System.out.println(al);
//        al.add(2, 55);
//        System.out.println(al);

//        System.out.println(al.remove(3));
//        System.out.println(al);

        int i=0; int j = al.size()-1;

        while (i<j){
            int temp = al.get(i);
            al.set(i, al.get(j));
            al.set(j, temp);
            i++;
            j--;
        }
        System.out.println(al);
    }
}
