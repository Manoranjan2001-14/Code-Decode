package multilevelinheritance;

public class Employee extends Person{
    int empId;

    void setEmpId(int empId){
        this.empId = empId;
    }

    void showEmpId(){
        System.out.println("EmployeeId:"+ empId);
    }
}
