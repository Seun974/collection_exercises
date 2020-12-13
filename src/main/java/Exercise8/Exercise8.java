package Exercise8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Exercise8 {
    public static void main(String[] args) {

        HashSet<String> randomNames = new HashSet<>();
        randomNames.add("Zoe");
        randomNames.add("Mike");
        randomNames.add("Peter");
        randomNames.add("Liam");
        randomNames.add("Jessica");
        randomNames.add("Betty");
        System.out.println("Hashset of random names: " + randomNames);

        //convert first to arraylist then sort
        ArrayList<String> randomNamesConverted = new ArrayList<>(randomNames);
        System.out.println("Unsorted names: "+ randomNamesConverted);

        Collections.sort(randomNamesConverted);
        System.out.println("Random names sorted is: " + randomNamesConverted);
    }
}
