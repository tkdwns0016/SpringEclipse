package test;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import person.Person;
import person.PersonMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/springContext.xml")
public class MybatisTest {

	@Autowired
	PersonMapper personMapper;
	
	@Test
	public void test() {
//		for(int i=0; i<5; i++) {
//			personMapper.insertPerson(new Person(0, "±¸±¸ÄÜ"+i, i));
//		}
//		assertNotNull(personMapper);
//		personMapper.insertPerson(new Person(0, "±Ô±Ô", 0));
//		personMapper.delete(1);
//		System.out.println(personMapper.update(new Person(2, "Ä¼Ä¼", 50)));
//		List<Person> people = personMapper.selectList();
//		for(Person person : people) {
//			System.out.println(person.getName());
//		}
		List<Person> people = personMapper.selectListSome(2,3);
		for(Person person : people) {
			System.out.println(person.getName());
		}
		
		
		
	}

	
	
}
