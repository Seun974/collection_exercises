package Exercise11;

import java.util.HashMap;
import java.util.Map;

public class Exercise11 {
    public static void main(String[] args) {
        HashMap<Integer, String> carBrand = new HashMap<>();
        carBrand.put(10, "Saab");
        carBrand.put(20, "Lexus");
        carBrand.put(30, "Lotus");
        carBrand.put(40, "Nissan");
        carBrand.put(50, "Volkswagen");
        //to transverse the map
        for (Map.Entry brandList : carBrand.entrySet()){
            System.out.println("The value of the car brand: " + brandList.getValue());
        }
    }
}
