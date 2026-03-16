package Day5;

import java.util.ArrayList;

public class BasicArrayListDemo {

    public static void main(String[] args) {

        // 1. Creating ArrayLists
        // Method 1: Default constructor
        ArrayList<String> fruits = new ArrayList<>();

        // Method 2: With initial capacity
        ArrayList<Integer> numbers = new ArrayList<>(20);

        // Method 3: From another collection
        ArrayList<String> fruitsCopy = new ArrayList<>(fruits);

        // 2. Adding elements
        System.out.println("=== ADDING ELEMENTS ===");
        fruits.add("Apple");           // Add at end
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("After adding: " + fruits);

        fruits.add(1, "Blueberry");    // Add at specific index
        System.out.println("After insert: " + fruits);

        // 3. Accessing elements
        System.out.println("\n=== ACCESSING ELEMENTS ===");
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);
        System.out.println("All fruits: " + fruits);

        // 4. Updating elements
        System.out.println("\n=== UPDATING ELEMENTS ===");
        fruits.set(2, "Blackberry");
        System.out.println("After update: " + fruits);

        // 5. Removing elements
        System.out.println("\n=== REMOVING ELEMENTS ===");
        fruits.remove(1);              // Remove by index
        System.out.println("After removing index 1: " + fruits);

        fruits.remove("Apple");        // Remove by object
        System.out.println("After removing 'Apple': " + fruits);

        // 6. Other useful methods
        System.out.println("\n=== OTHER METHODS ===");
        System.out.println("Size: " + fruits.size());
        System.out.println("Is empty? " + fruits.isEmpty());
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));
        System.out.println("Index of 'Cherry': " + fruits.indexOf("Cherry"));

        // 7. Clear all elements
        fruits.clear();
        System.out.println("After clear: " + fruits);
        System.out.println("Size after clear: " + fruits.size());
    }
}
