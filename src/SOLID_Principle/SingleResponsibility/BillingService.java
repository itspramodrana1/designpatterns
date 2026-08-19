package SOLID_Principle.SingleResponsibility;

public class BillingService {

    public void generateInvoice(){
        System.out.println("Invoice generated");
    }

    public void downloadInvoicePdf(){
        System.out.println("Invoice download");
    }


}
