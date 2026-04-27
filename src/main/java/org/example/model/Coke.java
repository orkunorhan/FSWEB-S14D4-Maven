package org.example.model;

public class Coke extends ProductForSale{
    private double volume;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, double volume) {
        super(type, price, description);
        this.volume = volume;
    }

    @Override
    public void showDetails() {
        System.out.println("Product: Coke");
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Volume: " + volume + "L");
    }
}
