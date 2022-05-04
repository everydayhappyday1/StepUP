package com.teampjt.StepUP.board;

import java.util.ArrayList;

import com.teampjt.StepUP.command.FreeBoardVO;
import com.teampjt.StepUP.command.MainCommentsVO;
import com.teampjt.StepUP.util.Criteria;



public interface BoardService {
	
	//글 등록
	public int fb_regist(FreeBoardVO freeBoardVO);
	
	//글 목록 불러오기
	public ArrayList<FreeBoardVO> fb_getList(Criteria cri);
	
	//글 게시글 수 불러오기 (total)
	public int fb_getTotal(Criteria cri);
	
	//글 내용 불러오기
	public FreeBoardVO fb_getUpdateList(int free_board_no);
	
	//글 내용 수정하기
	public int fb_update(FreeBoardVO freeBoardVO);

	//글 삭제
	public int fb_delete(FreeBoardVO freeBoardVO); // 보드넘버만 들고간다.
	
	//댓글 등록
	public int mc_regist(MainCommentsVO mainCommentsVO);
	
	//댓글 목록 불러오기
	public ArrayList<MainCommentsVO> mc_getList(MainCommentsVO mainCommentsVO);
	
	//댓글 삭제
	public int mc_delete(MainCommentsVO mainCommentsVO);
	
	//댓글 업데이트
	public int mc_UpdateContents(MainCommentsVO mainCommentsVO);
	
}
