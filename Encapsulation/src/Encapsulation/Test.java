package Encapsulation;
 class Student{
    private String name;
    private int age;
    private int rno;
    private char sec;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    void setRno(int rno){
        this.rno = rno;
    }
    int getRno(){
        return rno;
    }
    void setSec(char sec){
        this.sec = sec;
    }
    char getSec(){
        return sec;
    }


}
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Ram");
        s1.setAge(24);
        s1.setRno(21);
        s1.setSec('A');

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getRno());
        System.out.println(s1.getSec());
    }
}
