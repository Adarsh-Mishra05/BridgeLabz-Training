package Week1.SalesReport;

public class Sale {

    private String date;   // YYYY-MM-DD
    private double amount;

    public Sale(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return date + " - ₹" + amount;
    }
}
