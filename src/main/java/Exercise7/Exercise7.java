package Exercise7;

import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        HashSet<String> randomNames = new HashSet<>();
        randomNames.add("Mark");
        randomNames.add("Lucas");
        randomNames.add("John");
        randomNames.add("Kodie");
        randomNames.add("Samuel");
        randomNames.add("Bjorn");

        System.out.println("Random HashSet of names: " + randomNames);

        ArrayList<String> randomNamesConverted = new ArrayList<>(randomNames);
        System.out.println("Unsorted names of ArrayList: "+ randomNamesConverted);

        ArrayList<String> sortedNames = new ArrayList<>();
        String[] n = new String[]{"Bjorn", "John", "Kodie", "Lucas", "Mark", "Samuel"};
        sortedNames.addAll(Arrays.asList(n));
        System.out.println("Manually sorting the list gives: " + sortedNames);

    }
}
