package SOLID_Principle.OpenClosed;

public class CCService implements PaymentService{

    @Override
    public void processPayment() {
        System.out.println("CC Payment");
    }
}
