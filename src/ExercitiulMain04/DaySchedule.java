package ExercitiulMain04;

import java.util.Scanner;

public class DaySchedule {
    public static void main(String[] args) {
        DaysOfTheWeek monday = DaysOfTheWeek.MONDAY;
        DaysOfTheWeek tuesday = DaysOfTheWeek.TUESDAY;
        DaysOfTheWeek wednesday = DaysOfTheWeek.WEDNESDAY;
        DaysOfTheWeek thursday = DaysOfTheWeek.THURSDAY;
        DaysOfTheWeek friday = DaysOfTheWeek.FRIDAY;
        DaysOfTheWeek saturday = DaysOfTheWeek.SATURDAY;
        DaysOfTheWeek sunday = DaysOfTheWeek.SUNDAY;

        Scanner scanner = new Scanner(System.in);
          String day = scanner.nextLine();
        while(!day.equals("exit")){
            DaysOfTheWeek theDay = DaysOfTheWeek.valueOf(day.toUpperCase());
            if (!day.equalsIgnoreCase("exit"))
                System.out.println(theDay.getTheSchedule());
            day = scanner.nextLine();
        }
        System.out.println("Goodbye!");
    }
}

