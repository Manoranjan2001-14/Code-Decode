package inheritance;

public class Doctor extends Person{
    String specialization;

    void showDetails(){
        display();
        System.out.println("Specialization: "+specialization);
    }
}
