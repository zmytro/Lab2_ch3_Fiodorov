package com.company;

public class Invoice {
    private String part_number;
    private String description;
    private int quantity_of_the_item;
    private double price_per_item;
    /**конструкторы**/
    public Invoice(String part_number, String description, int quantity_of_the_item, double price_per_item) {
        this.part_number = part_number;
        this.description = description;

        if (quantity_of_the_item > 0) {
            this.quantity_of_the_item = quantity_of_the_item;
        }

        if (price_per_item > 0.0) {
            this.price_per_item = price_per_item;
        }
    }
    /**геттеры**/
    public double getInvoiceAmount() {

        return quantity_of_the_item * price_per_item;
    }

    public String getPart_number() {
        return part_number;
    }

    public String getDescription() {
        return description;
    }

    public double getPricePerItem() {
        return price_per_item;
    }

    public int getQuantity_of_the_items() {
        return quantity_of_the_item;
    }
    /**сеттеры*/
    public void setPart_number(String part_number) {
        this.part_number = part_number;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity_of_the_item(int quantity_of_the_item) {
        if (quantity_of_the_item > 0) {
            this.quantity_of_the_item = quantity_of_the_item;
        }
    }

    public void setPricePerItem(double price_per_item) {
        if (price_per_item > 0.0) {
            this.price_per_item = price_per_item;
        }
    }
}