package com.tarv07.inventory.service;

import com.tarv07.inventory.model.Item;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryService {
    private List<Item> inventoryList;
    private Map<String, Item> inventoryMap;

    public InventoryService(){
        this.inventoryList = new ArrayList<>();
        this.inventoryMap = new HashMap<>();
    }

    //add item
    public void addItem (Item item){
        if(inventoryMap.containsKey(item.getId())){
            System.out.println("Item with ID" + item.getId() + "already exists");
        }
        inventoryList.add(item);
        inventoryMap.put(item.getId(), item);
        System.out.println("Item added: " + item);
    }

    //remove item
    public void removeItem (String id){
        Item item = inventoryMap.get(id);
        if(item == null){
            System.out.println("Item with ID " + id + " not found.");
            return;
        }
        inventoryList.remove(item);
        inventoryMap.remove(id);
        System.out.println("Item removed: " + item);
    }

    //search for item by id
    public Item searchItemById (String id){
        return inventoryMap.get(id);
    }

    //search for item by name
    public List<Item> searchItemByName (String name){
        List<Item> results = new ArrayList<>();
        for (Item item : inventoryList) {
            if(item.getName().equalsIgnoreCase(name)){
                results.add(item);
            }
        }
        return results;
    }

    //list all items
    public List<Item> listItems (){
        return new ArrayList<>(inventoryList);
    }
}