package Exercises.ProductInventory.main;

import Exercises.ProductInventory.inventory.Product;
import Exercises.ProductInventory.inventory.Inventory;
import Exercises.ProductInventory.inventory.Warehouse;
public class Main {
    public static void main(String[] args){
        Product product = new Product();
        Inventory inventory = new Inventory();
        Warehouse warehouse = new Warehouse();

        product.setProductName("Apple MacBook Pro");
        product.setProductId(2761902);
        product.setPrice(3000.00);

        inventory.setProduct(product);
        inventory.setQuantity(12);

        warehouse.setWarehouseName("Michigan Apple Store");
        warehouse.setWarehouseId(2525576);
        warehouse.setInventories("In Stock");

        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Product price: $" + product.getPrice());

        System.out.println("Inventory Product: " + inventory.getProduct());
        System.out.println("Inventory Product Quantity: " + inventory.getQuantity());

        System.out.println("Warehouse Name: " + warehouse.getWarehouseName());
        System.out.println("Warehouse ID: " + warehouse.getWarehouseId());
        System.out.println("Warehouse Inventories: " + warehouse.getInventories());
    }
}
