package SOLID_Principle.LiskovSubstitution;

public interface Payment extends NonRefundablePayment{

    void refund();
}
