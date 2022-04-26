package com.teampjt.StepUP.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.teampjt.StepUP.command.GroupDetailCommentVO;
import com.teampjt.StepUP.command.UserVO;
import com.teampjt.StepUP.util.Criteria;

public interface UserService {
	
	public int regist(UserVO vo);
	
	public int userJoin(UserVO vo);
	

	public int userDelete(int user_no);
	//그룹 신청인 목록 조회 메서드
	public ArrayList<UserVO> getApplyList(Criteria cri);
	//그룹 신청인 전체 인원 수
	public int getApplyTotal();
  
	public int update(UserVO userVO);
  
	public UserVO login(UserVO vo);
	
	

}
