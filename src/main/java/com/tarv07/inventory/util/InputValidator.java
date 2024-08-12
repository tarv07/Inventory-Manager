package com.tarv07.inventory.util;

public class InputValidator {

    public static boolean isValidId(String id) {
        return id != null && !id.trim().isEmpty();
    }

    public static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public static boolean isValidQuantity(int quantity) {
        return quantity >= 0;
    }

    public static boolean isValidPrice(double price) {
        return price >= 0.0;
    }
}
