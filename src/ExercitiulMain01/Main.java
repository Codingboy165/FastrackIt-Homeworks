package ExercitiulMain01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> theMap =new HashMap<>();
    theMap.put("Max",8);
    theMap.put("Nina",4);
    theMap.put("Maria",7);
    theMap.put("John",10);
    theMap.put("Alex",6);
        System.out.println(highestGrade(theMap));

    }

    public static String highestGrade(Map<String, Integer> maps){
        int max=0;
        String theStudentWithMaxGrade=null;
        Map<String, Integer> entry = maps;
        Set<Map.Entry<String, Integer>> entries = entry.entrySet();
        for (Map.Entry<String, Integer> result: entries){
            if(result.getValue()>max){
                max=result.getValue();
                theStudentWithMaxGrade=result.getKey();
            }
        }
        return theStudentWithMaxGrade;
    }

}

