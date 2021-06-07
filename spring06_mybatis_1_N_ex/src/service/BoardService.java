package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import board.Board;
import comment.Comment;
import mapper.BoardWithComment;

@Service
public class BoardService {
	
	@Autowired
	BoardWithComment bwc;
	
	@Transactional(rollbackFor = Exception.class)
	public void deleteBoardAndComment(int id) throws Exception {
		bwc.deleteContent(id);
		bwc.deleteCommentByContentId(id);
	}
	
	@Transactional(rollbackFor = RuntimeException.class)
	public int insertBoard(Board board) {
		int re = bwc.insertBoard(board);
		return re;
	}
	
	@Transactional(rollbackFor = RuntimeException.class)
	public int updateBoardContent(Board board) {
		int re = bwc.updateBoardContent(board);
		return re;
	}
	
	@Transactional(rollbackFor = RuntimeException.class)
	public int insertContent(Comment comment) {
		int re = bwc.insertComment(comment);
		return re;
	}
	
}
