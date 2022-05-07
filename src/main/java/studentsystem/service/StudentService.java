package studentsystem.service;

import java.util.List;

import studentsystem.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
