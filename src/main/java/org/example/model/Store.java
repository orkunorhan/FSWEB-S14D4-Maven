package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Dark", 50.0, "Bitter chocolate", 70);
        products[1] = new Coke("Zero", 20.0, "Sugar free coke", 1.5);
        products[2] = new Bread("Whole Wheat", 15.0, "Healthy bread", 500);

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {

        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("\n");
        }
    }
}