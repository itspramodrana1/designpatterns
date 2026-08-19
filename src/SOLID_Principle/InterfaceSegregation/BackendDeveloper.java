package SOLID_Principle.InterfaceSegregation;

public class BackendDeveloper implements Coder, Tester {
    @Override
    public void writeCode() {
        System.out.println("Writing backend code");
    }

    @Override
    public void testCode() {
        System.out.println("QA Testing the code");
    }


}
