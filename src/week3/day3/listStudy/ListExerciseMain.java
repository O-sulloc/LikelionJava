package week3.day3.listStudy;

import java.util.List;

public class ListExerciseMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();

        List<String> students = listExercise.getStudents();
        for (String student : students) {
            System.out.println(student); //이름 출력
        }
        //System.out.println(students.size()); //인원 출력
    }
}