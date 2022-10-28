package soa.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import soa.entity.Student;
import soa.repository.StudentRepository;

public class Query implements GraphQLRootResolver{
	private final StudentRepository studentRepo ;

	public Query(StudentRepository studentRepo) {
		this.studentRepo = studentRepo;
	}
public List<Student> allStudents(){
	return studentRepo.getStudents();
	
}	

public Student search(String cin) {
	return studentRepo.recherche(cin); 
}

}
