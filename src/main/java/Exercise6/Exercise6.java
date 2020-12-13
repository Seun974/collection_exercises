package Exercise6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Exercise6 {
    public static void main(String[] args) {

        HashSet<String> weekDay = new HashSet<>();
        weekDay.add("Monday");
        weekDay.add("Tuesday");
        weekDay.add("Wednesday");
        weekDay.add("Thursday");
        weekDay.add("Friday");
        weekDay.add("Saturday");
        weekDay.add("Sunday");

        Iterator<String> itr = weekDay.iterator();
        while(itr.hasNext()){
            System.out.println("HashSet list days of the week: " + itr.next());
        }
        ArrayList<String> weekDayConverted = new ArrayList<>(weekDay);
        System.out.println("Converted hashSet to ArrayList is: " + weekDayConverted);

    }
}
