package HW3.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = getStudents();

        List<Student> resultList = studentList.stream()
                .filter(student -> student.getSpecialty().equals("info"))
                .filter(student -> getAverageGrade(student)> 4.5)
                .sorted(Comparator.comparingDouble(Main::getAverageGrade).reversed())
                .collect(Collectors.toList());
        for (Student student : resultList) {
            System.out.println(student.getName() + " " +
            getAverageGrade(student));
        }
    }

    private static List<Student> getStudents() {
        Student student1 = new Student("Vova", getRandomGradesList(), "math");
        Student student2 = new Student("Galya", getRandomGradesList(), "info");
        Student student3 = new Student("Kolya", getRandomGradesList(), "info");
        Student student5 = new Student("Vasya", getRandomGradesList(), "info");
        Student student4 = new Student("Sasha", getRandomGradesList(), "electric");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        return studentList;
    }

    public static double getAverageGrade(Student student) {
        return student.getGrades()
                .stream()
                .mapToInt(n -> n)
                .average().orElse(0);
    }

    public static List<Integer> getRandomGradesList() {
        List<Integer> grades = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            grades.add(new Random().nextInt(10));
        }
        return grades;
    }
}
