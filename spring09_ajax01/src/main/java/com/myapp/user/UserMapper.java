package com.myapp.user;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

	@Select("select * from user")
	public List<User> selectList();

	@Insert("insert into user values(#{id},#{userId},#{password},#{birthDate},#{phone},#{address},#{joinedDate})")
	public int insertUser(User user);
	
	
	
	
	
}
