package marvel;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarvelService {

	@Autowired
	MarvelMapper marvelMapper;
	
	public List<Marvel> selectAll(){
		return marvelMapper.selectAll();
	}
	
	public Marvel insertMovie(Marvel marvel) {
		
		marvel.setWriteDate(LocalDateTime.now());
		marvel.setUpdateDate(LocalDateTime.now());
		System.out.println(marvel);
		int affectedRow = marvelMapper.insertMovie(marvel);
		if(affectedRow == 1) {
			return marvel;
		}else {
			return null;
		}
	}
	
	public Marvel selectOneMovie(int marvelId) {
		Marvel marvel = marvelMapper.selectOneMovie(marvelId);
		return marvel;
	}
	
	public Marvel updateMovie(Marvel marvel) {
		marvel.setUpdateDate(LocalDateTime.now());
		int affectedRow = marvelMapper.updateMovie(marvel);
		if(affectedRow==1) {
			return marvel;
		}else {
		return null;
		}
	}
	
	public String deleteMovie(int marvelId) {
		int affectedRow = marvelMapper.deleteMovie(marvelId);
		if(affectedRow ==1) {
			System.out.println(affectedRow);
			return "삭제 성공";
		}else {
		return "삭제 실패";
		}
	}
	
}
