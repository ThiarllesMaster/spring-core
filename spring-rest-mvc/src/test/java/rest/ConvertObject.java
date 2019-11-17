package rest;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.MyBean;
import model.StudentJakson;
import model.Team;

public class ConvertObject {
	

	@Test
	void test() throws JsonProcessingException {
		StudentJakson student = new StudentJakson();
		student.setName("Rafinha");
		String result = new ObjectMapper().writeValueAsString(student);
		assertThat(result, containsString("Rafinha"));	
		
	}
	
	@Test
	public void testRootElementJson() throws JsonProcessingException {
		MyBean bean = new MyBean();
		bean.setId(1L);
		bean.setName("Name");
		
		String result = new ObjectMapper().writeValueAsString(bean);
		System.out.println(result);
	}
	
	@Test
	public void testIgnoreProperty() throws JsonProcessingException {
		Team team = new Team();
		team.setId(1L);
		team.setName("Name team");
		
		String result = new ObjectMapper().writeValueAsString(team);
		System.out.println(result);
	}

}
