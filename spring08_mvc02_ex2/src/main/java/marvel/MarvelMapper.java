package marvel;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MarvelMapper {

	@Select("select * from movie")
	public List<Marvel> selectAll();
	
	@Select("select count(*) from movie")
	public int selectCount();
	
	@Insert("insert into marvel values(#{marvelId},#{title},#{titleEng},#{releaseDate},#{worldBoxOffice},#{writeDate},#{updateDate} )")
	@Options(useGeneratedKeys = true,keyProperty = "marvelId")
	public int insertMovie(Marvel marvel);
	
	@Select("select * from marvel where marvel_id=#{marvelId}")
	public Marvel selectOneMovie(int marvelId);
	
	@Update("update marvel set title=#{title},title_eng=#{titleEng},release_date=#{releaseDate},world_box_office=#{worldBoxOffice},update_date=#{updateDate} where marvel_id=#{marvelId}")
	@Options(useGeneratedKeys = true,keyProperty = "marvelId")
	public int updateMovie(Marvel marvel);
	
	@Delete("delete from marvel where marvel_id=#{marvelId}")
	public int deleteMovie(int marvelId);
	
	@Select("select * from movie order by id asc limit #{startNum},#{endNum}")
	public List<Marvel> showSelect(@Param("startNum")int startNum ,@Param("endNum") int endNum);
	
	
	
	
	
}
