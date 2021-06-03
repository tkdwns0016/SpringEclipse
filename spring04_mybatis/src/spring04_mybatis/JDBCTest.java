package spring04_mybatis;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring04_mybatis/springContext.xml")
public class JDBCTest {

	@Autowired
	SqlSession sqlSession;

	@Ignore
	@Test
	public void test() {
		ApplicationContext ctx = new GenericXmlApplicationContext("spring04_mybatis/springContext.xml");

		DataSource ds = ctx.getBean(DataSource.class);

		SqlSessionFactoryBean ssfb = ctx.getBean(SqlSessionFactoryBean.class);

		SqlSessionTemplate sqlSession = ctx.getBean(SqlSessionTemplate.class);
		assertNotNull(sqlSession);
	}

	@Ignore
	@Test
	public void insertTest() {

		Person person = new Person(0, "īŸ����", 25);

		// sqlSession.update("���ӽ����̽�.����������� �ִ� �±��� id", �Ķ����)
		int affectedRows = sqlSession.update("personSession.insertPerson", person);
		System.out.println("����� row : " + affectedRows);

	}
	
	@Ignore
	@Test
	public void selectTest() {
		List<Person> personList = sqlSession.selectList("personSession.selectPersonList");
		for (Person person : personList) {
			System.out.println(person);
		}
	}
	
	@Ignore
	@Test
	public void deleteTest() {
		int affectedRows = sqlSession.delete("personSession.deletePerson",1);
		System.out.println("����� �ο� : "+affectedRows);
	}
	
	@Ignore
	@Test
	public void selectOneTest() {
		Person person = sqlSession.selectOne("personSession.selectPersonById",2);
		System.out.println(person);
	}

	@Test
	public void updateTest() {
		Person person = new Person(2,"īŸ����",20);
		int affectedRows = sqlSession.update("updatePerson",person);
		System.out.println("������ Row : " +affectedRows);
	}
	
	
	
}