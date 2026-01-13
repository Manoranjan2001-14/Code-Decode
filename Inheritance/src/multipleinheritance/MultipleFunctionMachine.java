package multipleinheritance;

public class MultipleFunctionMachine implements Printer, Scanner{
    @Override
    public void print(){
        System.out.println("Printing document");
    }
    @Override
    public void scan(){
        System.out.println("Scanning Document");
    }
}
