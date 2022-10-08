package ExercitiulMain;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private final List<StudentGrade> grades;

    public Classroom(List<StudentGrade> grades) {
        this.grades = grades;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> result = new ArrayList<>();
        for (StudentGrade studentGrade : grades) {
            if (studentGrade.discipline().equals(discipline)) {
                result.add(studentGrade.grade());
            }
        }
        return result;
    }

    public List<Integer> getGradesForStudent(String student) {
        List<Integer> result = new ArrayList<>();
        for (StudentGrade studentGrade : grades) {
            if (studentGrade.fullName().equals(student)) {
                result.add(studentGrade.grade());
            }
        }
        if (result.isEmpty()) {
            return null;
        } else {
            return result;
        }
    }

    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade result = null;
        int max = 0;
        if (discipline == null) {
            return null;
        } else {
            for (StudentGrade studentGrade : grades) {
                if ((studentGrade.discipline().equals(discipline)) && (studentGrade.grade() > max)) {
                    result = studentGrade;
                    max = studentGrade.grade();
                }
            }
            return result;
        }
    }

    public StudentGrade getMaxGrade() {
        StudentGrade result = null;
        int max = 0;
        for (StudentGrade studentGrade : grades) {
            if (studentGrade.grade() > max && studentGrade.grade() < 11) {
                result = studentGrade;
                max = studentGrade.grade();
            }
        }
        return result;
    }

    public double getAverageGrade(String discipline) {
        int i = 0;
        double sum = 0;
        for (StudentGrade studentGrade : grades) {
            if (studentGrade.discipline().equals(discipline)) {
                i++;
                sum += studentGrade.grade();
            }
        }
        return sum / i;
    }
    public double getAverageGrade() {
        int i = 0;
        double sum = 0;
        for (StudentGrade studentGrade : grades) {
            i++;
            sum += studentGrade.grade();
        }
        return sum / i;
    }

    public StudentGrade getWorstGrade(String discipline) {
        StudentGrade result = null;
        int min = 11;
        for (StudentGrade studentGrade : grades) {
            if ((studentGrade.discipline().equals(discipline)) && (studentGrade.grade() < min)) {
                result = studentGrade;
                min = studentGrade.grade();
            }
        }
        return result;
    }
    public StudentGrade getWorstGrade() {
        StudentGrade result = null;
        int min = 11;
        for (StudentGrade studentGrade : grades) {
            if (studentGrade.grade() < min) {
                result = studentGrade;
                min = studentGrade.grade();
            }
        }
        return result;
    }
}


