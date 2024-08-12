package com.tarv07.inventory.controller;

import com.tarv07.inventory.model.Item;
import com.tarv07.inventory.service.InventoryService;
import com.tarv07.inventory.view.InventoryView;

import java.util.List;

public class InventoryController {
    private InventoryService inventoryService;
    private InventoryView inventoryView;

    public InventoryController (InventoryService inventoryService, InventoryView inventoryView){
        this.inventoryService = inventoryService;
        this.inventoryView = inventoryView;
    }

    //add new item
    public void addItem (String id, String name, int quantity, double price){
        Item item = new Item(id, name, quantity, price);
        inventoryService.addItem(item);
        inventoryView.displayMessage("Item added successfully.");
    }

    //remove by id
    public void removeItem (String id){
        inventoryService.removeItem(id);
        inventoryView.displayMessage("Item removed successfully.");
    }

    //search by id
    public void searchItemById (String id){
        Item item = inventoryService.searchItemById(id);
        if(item != null){
            inventoryView.displayItem(item);
        }else{
            inventoryView.displayMessage("Item with ID " + id + " not found.");
        }
    }

    //search by name
    public void searchItemByName (String name){
        List<Item> items = inventoryService.searchItemByName(name);
        if(items.isEmpty()){
            inventoryView.displayMessage("No items found with the name " + name + ".");
        }else{
            inventoryView.displayItems(items);
        }
    }

    //list items
    public void listItems (){
        List<Item> items = inventoryService.listItems();
        if(items.isEmpty()){
            inventoryView.displayMessage("The inventory is empty.");
        }else{
            inventoryView.displayItems(items);
        }
    }

}
