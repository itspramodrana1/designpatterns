package SOLID_Principle.InterfaceSegregation;

public class DevOpsEngineer implements Deployer {

    @Override
    public void deployApplication() {
        System.out.println("Dev writing the Code");
    }
}
