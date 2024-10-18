package org.example.model;

public class Bread extends ProductForSale {
    private String flourType;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    public Bread(String type, int price, String description, String flourType) {
        super(type, price, description);
        this.flourType = flourType;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread type: " + getType() + " Bread price: " + getPrice() + " Bread description: " + getDescription() + " Bread flour type " + flourType);
    }
}
