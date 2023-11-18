package homework39;

import de.ait.homework39.Student;
import de.ait.homework39.StudentDatabase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

class StudentDatabaseTest {

    private StudentDatabase studentDatabase;

    @BeforeEach
    public void setUp(){
        studentDatabase = new StudentDatabase();
    }

    @Test
    void addStudentSuccess() {
        Student student = new Student(1, "Mustermann", 25);
        Assertions.assertEquals(0,studentDatabase.getStudents().size());
        Assertions.assertTrue(studentDatabase.addStudent(student));
        Set<Student> studentHashSet = studentDatabase.getStudents();
        Assertions.assertEquals(1,studentHashSet.size());
        for (Student databaseStudent: studentHashSet){
            Assertions.assertEquals(databaseStudent,student);
        }
    }

    @Test
    void addStudentNull() {
        Assertions.assertFalse(studentDatabase.addStudent(null));
    }

    @Test
    void addStudentFailStudentExists() {
        Student student = new Student(1, "Mustermann", 25);
        Student newStudent = new Student(1, "Mustermann", 25);
        Assertions.assertEquals(0,studentDatabase.getStudents().size());
        studentDatabase.addStudent(student);
        Assertions.assertFalse(studentDatabase.addStudent(newStudent));
        Assertions.assertEquals(1,studentDatabase.getStudents().size());

    }


    @Test
    void removeStudentSuccess() {
        Student student = new Student(1, "Mustermann", 25);
        Assertions.assertEquals(0,studentDatabase.getStudents().size());
        studentDatabase.addStudent(student);
        Assertions.assertEquals(1,studentDatabase.getStudents().size());
        studentDatabase.removeStudent(student);
        Assertions.assertEquals(0,studentDatabase.getStudents().size());
    }

    @Test
    void removeStudentFailStudentNull() {
        Assertions.assertFalse(studentDatabase.removeStudent(null));
    }

    @Test
    void removeStudentFailNotExists() {
        Student student = new Student(1, "Mustermann", 25);
        Assertions.assertFalse(studentDatabase.removeStudent(student));
    }

}