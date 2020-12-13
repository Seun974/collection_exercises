package Exercise2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Exercise2 {

    public static void main(String[] args) {

        // Iterating and printing separately - List 2
        ArrayList<String> daysOfTheWeek2 = new ArrayList<>();
        daysOfTheWeek2.add("Monday");
        daysOfTheWeek2.add("Tuesday");
        daysOfTheWeek2.add("Wednesday");
        daysOfTheWeek2.add("Thursday");
        daysOfTheWeek2.add("Friday");
        daysOfTheWeek2.add("Saturday");
        daysOfTheWeek2.add("Sunday");
        //Iterator will check and print next object
        ListIterator<String> itr = daysOfTheWeek2.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

