package de.ait.homework28;

public class Electronics extends Product{

    private int warrantyYears;

    public Electronics(String name, double price, int quantity, int warrantyYears) {
        super(name, price, quantity);
        this.warrantyYears = warrantyYears;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    @Override
    public String getInfo() {
        return "Electronics{" +
                "warrantyYears=" + warrantyYears +
                "} " + super.getInfo();
    }
}
