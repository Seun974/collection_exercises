package Exercise4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<String> weekDay4 = new ArrayList<>();
        weekDay4.add("Monday");
        weekDay4.add("Tuesday");
        weekDay4.add("Wednesday");
        weekDay4.add("Thursday");
        weekDay4.add("Friday");
        weekDay4.add("Saturday");
        weekDay4.add("Sunday");

        System.out.println("Complete days of the week list : " + weekDay4);
        //import the list class to get this to work and index from to
        List<String> subList = weekDay4.subList(0,3);
        System.out.println("The subList for the weekday is: " + subList);

    }
}

