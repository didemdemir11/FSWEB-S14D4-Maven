package org.example.model;

import org.example.rpg.Troll;

public class Store {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("Chocolate", 2.5, "Rich dark chocolate", "Dark");
        Coke coke = new Coke("Coke", 1.5, "Refreshing beverage", "light");
        Bread bread = new Bread("Bread", 3.0, "Whole grain bread", "Medium");
        //listProducts();
        ProductForSale[] products = { chocolate,coke,bread};
        Store store = new Store();
        store.listProducts(products);
        System.out.println("-----------------------------------");

        Troll troll = new Troll("Mountain Troll", 100, 50.0);
        System.out.println("Monster: " + troll.getName());
        System.out.println("Hit Points: " + troll.getHitPoints());
        System.out.println("Base Damage: " + troll.getDamage());
        System.out.println("Attack Damage: " + troll.attack());
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products){
            product.showDetails();
        }
    }
}