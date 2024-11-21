package org.example.model;

public class Coke extends ProductForSale{
    private String cokeType;
    public Coke(String type, double price, String description, String cokeType) {
        super(type, price, description);
        this.cokeType=cokeType;
    }
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public String getCokeType() {
        return cokeType;
    }

    @Override
    public void showDetails() {

        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Coke type: " + cokeType);
    }
}
