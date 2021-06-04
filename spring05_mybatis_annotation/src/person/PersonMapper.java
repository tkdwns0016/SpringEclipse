package person;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PersonMapper {
	//���̹�Ƽ�� annotation������� ������ �ۼ��ϱ�
	@Insert("insert into person values(#{id},#{name},#{age})")
	public void insertPerson(Person person);
	
	@Delete("delete from person where id=#{id}")
	public void delete(int id);
	
	@Update("update person set name=#{name},age=#{age} where id=#{id}")
	public int update(Person person);
	
	@Select("select id, name, age from person")
	public List<Person> selectList();
	
	
	@Select("select * from person limit #{startRow},#{cnt}")
	public List<Person> selectListSome(@Param("startRow") int startRow,@Param("cnt") int cnt);
	
	
	
	
	
	
	
	
}
