package de.ait.homework28;

public class Groceries extends Product {

    private String expirationDate;

    public Groceries(String name, double price, int quantity, String expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String getInfo() {
        return "Groceries{" +
                "expirationDate='" + expirationDate + '\'' +
                "} " + super.getInfo();
    }
}
