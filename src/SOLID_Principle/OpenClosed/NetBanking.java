package SOLID_Principle.OpenClosed;

public class NetBanking implements PaymentService{

    @Override
    public void processPayment() {
        System.out.println("NetBanking Payment");
    }

}
