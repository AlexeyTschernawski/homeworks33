package de.ait.homework39;

import java.util.HashSet;
import java.util.Set;

public class StudentDatabase {

    private Set<Student> students = new HashSet<>();

    public boolean addStudent(Student newStudent) {
        if(newStudent == null){
            return false;
        }
        for (Student student : students) {
            if (student.equals(newStudent)) {
                System.out.println("Student with id " + newStudent.getId() + " already exists");
                return false;
            }
        }
        students.add(newStudent);
        System.out.println("Student with id " + newStudent.getId() + " added");
        return true;
    }

    public boolean removeStudent(Student deleteStudent){
        if(deleteStudent == null){
            return false;
        }
        if(containsStudent(deleteStudent)){
            return students.remove(deleteStudent);
        }
        else {
            System.out.println("Student with id " + deleteStudent.getId() + " does not exist");
            return false;
        }
    }

    private boolean containsStudent(Student checkStudent){
        return students.contains(checkStudent);
    }

    public void printAllStudents(){
        for (Student student: students){
            System.out.println(student.toString());
        }
    }

    public Set<Student> getStudents() {
        return students;
    }
}
