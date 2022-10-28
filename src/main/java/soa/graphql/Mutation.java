package soa.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import soa.entity.Student;
import soa.repository.StudentRepository;

public class Mutation implements GraphQLRootResolver{
	private final StudentRepository studentRepo ;

	public Mutation(StudentRepository studentRepo) {
		this.studentRepo = studentRepo;
	}


public Student save(String cin, String nompre, String email) {
	Student s = new Student(cin, nompre,email);
studentRepo.saveStudent(s); 
return s ; 
}

}
