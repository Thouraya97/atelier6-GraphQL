package soa.repository;

import java.util.ArrayList;
import java.util.List;

import soa.entity.Student;

public class StudentRepository {
private final List<Student>students;

public StudentRepository() {
students=new ArrayList<>(); 
students.add(new Student("00112233","user ben user","user@user.com"));
students.add(new Student("00445566","user1 ben user1","user1@user1.com"));

}
public List<Student> getStudents() {
	return students;
}


public void saveStudent(Student student) {
	students.add(student);
}

public static Student getByCin(String cin) {
   return null ;//students.stream().filter(student -> student.getCin().equals(cin)).findFirst().orElse(null);

}

public Student recherche(String cin) {
	for(Student s:students) {
		if(s.getCin().equals(cin))
			return s; 
	}
	return null ; 

}
}
