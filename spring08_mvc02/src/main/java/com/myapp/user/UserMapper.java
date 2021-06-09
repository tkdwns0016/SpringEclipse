package com.myapp.user;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	
	@Select("select id,user_id,password,birth_date,phone,address,joined_date from user")
	public List<User> selectUsers();
	
	@Insert("insert into user values(#{id},#{userId},#{password},#{birthDate},#{phone},#{address},#{joinedDate})")
	@Options(useGeneratedKeys = true,keyProperty = "id")
	public int insertUser(User user);
	
	
}
