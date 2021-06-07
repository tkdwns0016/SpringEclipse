package mapper;

import org.apache.ibatis.annotations.Mapper;

import board.Board;
import comment.Comment;

@Mapper
public interface BoardWithComment {
	public Board selectBoardWithComment(int id); //게시글 조회 
	
	public void deleteContent(int id); //게시글 삭제
	
	public int insertBoard(Board board); //게시글 삽입
	
	public int updateBoardContent(Board board); //게시글 수정
	
	public void deleteCommentByContentId(int id); // 코멘트 삭제
	
	public int insertComment(Comment comment);
	
	
	
	
	
	
}
