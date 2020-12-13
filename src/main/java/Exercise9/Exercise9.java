package Exercise9;

import java.util.HashMap;
import java.util.Map;

public class Exercise9 {
    public static void main(String[] args) {
        HashMap<Integer, String> carDetails = new HashMap<>();
        carDetails.put(1, "Volvo");
        carDetails.put(2, "BMW");
        carDetails.put(3, "Honda");
        carDetails.put(4, "Mercedes");
        carDetails.put(5, "Toyota");
        //iterating through the list to get all the objects
        for(Map.Entry carEntered : carDetails.entrySet()) {
            System.out.println("Car details: " + carEntered.getKey() + " - brand name " + carEntered.getValue());
        }
    }
}
