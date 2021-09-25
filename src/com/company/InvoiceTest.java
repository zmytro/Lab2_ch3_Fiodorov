package com.company;
import java.util.Scanner;
public class InvoiceTest {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String custom_part_number,custom_description;
        int custom_quantity;
        double custom_price;
        /**Test Invoices**/
        Invoice invoice1 = new Invoice("000_001", "Acer Nitro 5", 3, 900);
        Invoice invoice2 = new Invoice("000_002", "Lenovo IdeaPad Gaming", 2, 815);


        System.out.printf(
                "INVOICE 1%nNumber: %s%nDescription: %s%nQuantity: %d%nPrice per item: $ %,.2f%nInvoice amount: $ %,.2f%n%n",
                invoice1.getPart_number(), invoice1.getDescription(), invoice1.getQuantity_of_the_items(),
                invoice1.getPricePerItem(), invoice1.getInvoiceAmount());

        System.out.printf(
                "INVOICE 2%nNumber: %s%nDescription: %s%nQuantity: %d%nPrice per item: $ %,.2f%nInvoice amount: $ %,.2f%n%n",
                invoice2.getPart_number(), invoice2.getDescription(), invoice2.getQuantity_of_the_items(),
                invoice2.getPricePerItem(), invoice2.getInvoiceAmount());

        /**Custom Invoice**/
        System.out.println("Create your own Invoice: ");
        System.out.println("Enter Number: ");
        custom_part_number = keyboard.nextLine();
        System.out.println("Enter Description: ");
        custom_description = keyboard.nextLine();
        System.out.println("Enter Quantity: ");
        custom_quantity = keyboard.nextInt();
        System.out.println("Enter Price: ");
        custom_price = keyboard.nextDouble();

        Invoice invoice3 = new Invoice(custom_part_number,custom_description,custom_quantity,custom_price);

        System.out.printf(
                "INVOICE 3%nNumber: %s%nDescription: %s%nQuantity: %d%nPrice per item: $ %,.2f%nInvoice amount: $ %,.2f",
                invoice3.getPart_number(), invoice3.getDescription(), invoice3.getQuantity_of_the_items(),
                invoice3.getPricePerItem(), invoice3.getInvoiceAmount());
    }
}
