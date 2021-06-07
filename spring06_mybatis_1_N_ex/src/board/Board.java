package board;

import java.time.LocalDate;
import java.util.List;

import comment.Comment;

public class Board {
	private int id;
	private String content;
	private LocalDate writeDate;
	private List<Comment> commentList;
	public Board(int id, String content, LocalDate writeDate) {
		super();
		this.id = id;
		this.content = content;
		this.writeDate = writeDate;
	}
	public Board() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDate getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(LocalDate writeDate) {
		this.writeDate = writeDate;
	}
	public List<Comment> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
	@Override
	public String toString() {
		return "Board [id=" + id + ", content=" + content + ", writeDate=" + writeDate + ", commentList=" + commentList
				+ "]";
	}
	
	

}
