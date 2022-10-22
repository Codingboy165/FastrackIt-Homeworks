package Exercises;

import static Exercises.DaysOfTheWeek.MONDAY;

public class Main {
    public static void main(String[] args) throws NoActivityException, NoActivitiesForDayException {
        DailyPlanner dailyPlanner= new DailyPlanner();
        dailyPlanner.addActivity(MONDAY,"RUN");
        dailyPlanner.addActivity(MONDAY,"SLEEP");
    }
}
