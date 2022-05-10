package studentsystem.service;

import java.util.List;
import java.util.Optional;

import studentsystem.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public Optional<List<Student>> getAllStudents();
}
