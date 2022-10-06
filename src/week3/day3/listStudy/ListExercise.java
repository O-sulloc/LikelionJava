package week3.day3.listStudy;


import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    private final List<String> students; //ㅇㅚ부에서 접근하면 안되니까 private으로 선언
    //this.students = new ArrayList<>();

    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("김경록");
        this.students.add("김미지");
        this.students.add("김민경");
        this.students.add("김민지");
    }

    public List<String> getStudents() {
        return students;
    }
}
