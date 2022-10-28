package soa.graphql;

import javax.servlet.annotation.WebServlet;

import com.coxautodev.graphql.tools.SchemaParser;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;
import soa.repository.StudentRepository;

@WebServlet(urlPatterns="/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet{

	public GraphQLEndpoint() {
		super(buildSchema());
		// TODO Auto-generated constructor stub
	}
	
private static GraphQLSchema buildSchema() {
	StudentRepository studentRepo= new StudentRepository();
	return SchemaParser.newParser().file("schema.graphql").resolvers(new Query(studentRepo),new Mutation(studentRepo)).build().makeExecutableSchema();
	
}
}
