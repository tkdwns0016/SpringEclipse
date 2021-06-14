package com.user.user;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.apache.ibatis.javassist.ClassPath;
import org.eclipse.jdt.internal.compiler.batch.ClasspathDirectory;
import org.eclipse.jdt.internal.compiler.batch.FileSystem.Classpath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DBTest {

	@Autowired
	DataSource dataSource;
	
	
	@Test
	public void test() {
		assertNotNull(dataSource);
	}
	

}
