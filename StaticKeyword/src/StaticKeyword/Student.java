package StaticKeyword;

public class Student {
    int id;
    static String college = "IIT";

     Student(int id){
        this.id = id;
    }

    void display(){
        System.out.println(id+" "+college);
    }
}
