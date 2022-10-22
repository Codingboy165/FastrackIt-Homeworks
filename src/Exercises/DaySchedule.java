package Exercises;

import java.util.List;

public class DaySchedule {
    private DaysOfTheWeek day;
    private List<String> activities;

    public DaySchedule(DaysOfTheWeek day, List<String> activities) {
        this.day = day;
        this.activities = activities;
    }

    public DaysOfTheWeek getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }
}
