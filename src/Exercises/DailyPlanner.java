package Exercises;

import java.util.ArrayList;
import java.util.List;

public class DailyPlanner {
    private List<DaySchedule> dailyPlanner = new ArrayList<>();

    public void addActivity(DaysOfTheWeek day, String activity){
        if (activity == null){
            throw new NoActivityException();
        }
    }

}
