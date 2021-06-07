package mapper;

import org.apache.ibatis.annotations.Mapper;

import board.Board;
import comment.Comment;

@Mapper
public interface BoardWithComment {
	public Board selectBoardWithComment(int id); //�Խñ� ��ȸ 
	
	public void deleteContent(int id); //�Խñ� ����
	
	public int insertBoard(Board board); //�Խñ� ����
	
	public int updateBoardContent(Board board); //�Խñ� ����
	
	public void deleteCommentByContentId(int id); // �ڸ�Ʈ ����
	
	public int insertComment(Comment comment);
	
	
	
	
	
	
}
