package Exercise3;

import java.util.ArrayList;

public class Exercise3 {

    public static void main(String[]args){

        //Array list with missing day of the week

        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        System.out.println("Days of the week: " + weekDays);

        weekDays.add(3,"Thursday");

        System.out.println("List with Thursday added = " + weekDays);


    }

}
