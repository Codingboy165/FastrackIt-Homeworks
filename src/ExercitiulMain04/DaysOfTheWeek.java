package ExercitiulMain04;

public enum DaysOfTheWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY,SUNDAY;

    public String getTheSchedule(){
        return switch (this){
            case MONDAY -> """
                    In monday the schedule is :
                    make your bad
                    take a shower
                    talk with the manager""";
            case TUESDAY -> """
                            In Tuesday the schedule is :
                            Make your bed
                            Make a coffee
                            Go to the ABC""";
            case WEDNESDAY -> """
                    In Wednesday the schedule is :
                    Make your bed
                    Take a shower
                    Clean the livingroom""";
            case THURSDAY -> """
                    In Thursday the schedule is :
                    Make your bed
                    Bring the child to school 
                    Move the trash out""";
            case FRIDAY -> """
                    In Friday the schedule is :
                    Make a coffee
                    Go to the Gym
                    Work""";
            case SATURDAY -> """
            In Tuesday the schedule is :
            Just relax""";
            case SUNDAY -> """
                    In Sunday the schedule is :
                    Just relax""";
        };
    }
}
