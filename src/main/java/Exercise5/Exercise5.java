package Exercise5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Exercise5 {
    public static void main(String[] args) {

        HashSet<String> daysOfTheWeek = new HashSet<>();
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");
        daysOfTheWeek.add("Sunday");
        Iterator<String> itr = daysOfTheWeek.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
