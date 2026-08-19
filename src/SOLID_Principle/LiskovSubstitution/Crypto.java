package SOLID_Principle.LiskovSubstitution;

public class Crypto implements NonRefundablePayment {

    @Override
    public void pay() {
        System.out.println("Crypto payment done");
    }


}
