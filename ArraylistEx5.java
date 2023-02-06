import java.util.*;

public class ArraylistEx5 {
    public static void main(String args[]) {
        ArrayList<String> listStrings = new ArrayList<String>(); // Appending elements one by one at the end
        listStrings.add("One");
        listStrings.add("Two");
        listStrings.add("Three");
        listStrings.add("Four");
        System.out.println(listStrings);
        // Inserting an element at a particular index
        listStrings.add(1, "A2");
        System.out.println(listStrings);
        // Search for a particular element
        if (listStrings.contains("Hello")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
        // Listing all elements starting with a given letter
        for (int i = 0; i < listStrings.size(); i++) {
            String newString = listStrings.get(i);
            if (newString.startsWith("T")) {
                System.out.println("The found the element is " + newString);
            }
        }
    }
}