package com.tarv07.inventory;

import com.tarv07.inventory.controller.InventoryController;
import com.tarv07.inventory.service.InventoryService;
import com.tarv07.inventory.view.InventoryView;

public class Main {
    public static void main(String[] args){
        InventoryService inventoryService = new InventoryService();
        InventoryView inventoryView = new InventoryView();
        InventoryController inventoryController = new InventoryController(inventoryService, inventoryView);


        //example items
        inventoryController.addItem("001", "Laptop", 10, 999.99);
        inventoryController.addItem("002", "Smartphone", 25, 499.99);
        inventoryController.addItem("003", "Tablet", 15, 299.99);

        //example method usage
        //list all items
        inventoryController.listItems();

        //search by id
        inventoryController.searchItemById("002");

        //search by name
        inventoryController.searchItemByName("Tablet");

        //remove item
        inventoryController.removeItem("001");

        //list again to verify removal
        inventoryController.listItems();

    }
}
