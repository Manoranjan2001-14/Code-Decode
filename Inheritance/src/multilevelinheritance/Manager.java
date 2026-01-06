package multilevelinheritance;

public class Manager extends Employee{
    String department;

    void setDepartment(String department){
        this.department = department;
    }

    void showDepartment(){
        System.out.println("Department:"+department);
    }
}
