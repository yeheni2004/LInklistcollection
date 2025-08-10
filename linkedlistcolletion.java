
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeheni
 */
public class linkedlistcolletion {
   
    public static void main(String[] args) {
        
        // LinkedList create කරමු (String type)
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.addFirst("Orange"); // add to front
        fruits.addLast("Grapes");  // add to end

        System.out.println("Initial list: " + fruits);

        // Access elements
        System.out.println("First element: " + fruits.getFirst());
        System.out.println("Last element: " + fruits.getLast());

        // Remove elements
        fruits.remove("Mango");
        fruits.removeFirst(); // remove first element
        fruits.removeLast();  // remove last element

        System.out.println("After removals: " + fruits);

        // Check if list contains an item
        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the list.");
        }

        // Size of the list
        System.out.println("List size: " + fruits.size());

        // Iterate through LinkedList
        System.out.println("Iterating through list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

    

