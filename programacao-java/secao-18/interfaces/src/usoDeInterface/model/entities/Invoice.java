package usoDeInterface.model.entities;

public class Invoice {
    private double BasicPayment;
    private double tax;

    public Invoice() {
    }
    public Invoice(double basicPayment, double tax) {
        BasicPayment = basicPayment;
        this.tax = tax;
    }


    public double getBasicPayment() {
        return BasicPayment;
    }
    public void setBasicPayment(double basicPayment) {
        BasicPayment = basicPayment;
    }
    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotalPayment() {
        return getBasicPayment() + getTax();
    }
}
