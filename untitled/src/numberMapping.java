import java.util.HashMap;

public class numberMapping {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 3, 2, 1, 4};


        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map using a fori loop
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i]; // Get the current element
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1); // Update frequency
        }

        // Print the mapping using a fori loop
        System.out.println("Number -> Frequency:");
        Object[] keys = frequencyMap.keySet().toArray(); // Convert keys to an array for indexed access
        for (int i = 0; i < keys.length; i++) {
            int key = (int) keys[i]; // Retrieve the key
            System.out.println(key + " -> " + frequencyMap.get(key)); // Print key-value pair
        }
    }
}
