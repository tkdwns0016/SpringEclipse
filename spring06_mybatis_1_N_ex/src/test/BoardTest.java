package test;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import board.Board;
import comment.Comment;
import mapper.BoardWithComment;
import service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/springContext.xml")
public class BoardTest {

	@Autowired
	BoardWithComment bwc;
	
	@Autowired
	BoardService bs;
	
	@Ignore
	@Test
	public void test() {
//		assertNotNull(bwc);
		Board b = bwc.selectBoardWithComment(1);
		System.out.println(b.getId());
		System.out.println(b.getContent());
		System.out.println(b.getWriteDate());
		System.out.println("------´ñ±Û------");
		for(Comment c : b.getCommentList()) {
			System.out.println(c.getId());
			System.out.println(c.getCommentContent());
			System.out.println(c.getWriteDate());
			System.out.println("----------");
		}
	}
	
	@Test
	public void test1() {
//		assertNotNull(bs);
		//-------------------
//		try {
//			bs.deleteBoardAndComment(1);
//		} catch (Exception e) {
//			System.out.println("¿¹¿Ü");
//			e.printStackTrace();
//		}
		//-------------------
//		System.out.println(bs.insertBoard(new Board(1,"»ç¶û°úÀüÀï", LocalDate.now())));
		//-------------------
//		System.out.println(bs.updateBoardContent(new Board(2, "»ç°ú³ª¹« »ç¶û°É·È³×",null)));
		//-------------------
//		System.out.println(bs.insertContent(new Comment(0, 3, "ºÎÀÚµéÀÇ »îÀÌ¶õ .", null)));
		
		
		
	}
	
}