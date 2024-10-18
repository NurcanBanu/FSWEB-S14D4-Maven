package org.example.model;

public class Coke extends ProductForSale{
    private boolean isSugary;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description, boolean isSugary) {
        super(type, price, description);
        this.isSugary = isSugary;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke type: " + getType() + " Coke price: " + getPrice() + " Coke description: " + getDescription() + " Coke sugar: " + isSugary);
    }
}
