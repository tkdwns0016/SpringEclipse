package user;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Value;

@Mapper
public interface UserMapper {
	
	@Insert("insert into user values(#{id},#{userId},#{password},#{birthDate},#{phone},#{address},#{joinedDate})")
	public int insertUser(User user);
	
	public List<User> selectAll();
	
//	@Delete("delete from user where id=#{id}")
	public int deleteUser(@Value("#{id}")int id);
	
//	@Update("update user set user_id=#{userId},birth_date=#{birthDate},address=#{address},joined_date=#{joinedDate} where id=#{id}")
	public int updateUser(User user);
	
}
