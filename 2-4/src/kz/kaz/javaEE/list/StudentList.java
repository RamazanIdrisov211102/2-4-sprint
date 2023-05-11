package kz.kaz.javaEE.list;

import kz.kaz.javaEE.entity.Student;

import java.util.ArrayList;

public class StudentList {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Long id = 5L;

    static
    {
        students.add(new Student(1L, "Nazarov", "Nurlybek", "IT1-2004"));
        students.add(new Student(2L, "Cristiano", "Ronaldo", "CR-7"));
        students.add(new Student(3L, "Messi", "Lionel", "LM-123"));
        students.add(new Student(4L, "Samat", "Samatov", "SIS1-2020"));
    }

    public static void addStudent(Student s){
        s.setId(id);
        students.add(s);
        id++;
    }
    public static ArrayList<Student> getAllStudents(){
        return students;
    }
}
