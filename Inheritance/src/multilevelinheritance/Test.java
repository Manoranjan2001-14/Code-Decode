package multilevelinheritance;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("Manoranjan");
        m.setEmpId(101);
        m.setDepartment("Java Development");

        m.showName();
        m.showEmpId();
        m.showDepartment();
    }
}
