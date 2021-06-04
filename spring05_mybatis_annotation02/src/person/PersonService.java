package person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	@Autowired
	PersonMapper personMapper;
	
	public void insertUser(Person person) {
		personMapper.insertPerson(person);
	}
	
	public void updateUser() {
		
	}
	
}
