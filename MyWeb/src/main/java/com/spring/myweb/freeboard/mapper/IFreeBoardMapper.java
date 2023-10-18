package com.spring.myweb.freeboard.mapper;

import java.util.List;

import com.spring.myweb.freeboard.dto.page.Page;
import com.spring.myweb.freeboard.entity.FreeBoard;

public interface IFreeBoardMapper {

	//글등록
	void regist(FreeBoard freeboard);
	//글목록
	List<FreeBoard> getList(Page page);
	// 총 게시물 개수 구하기
	int getTotal(Page page);
	//상세보기
	FreeBoard getContent(int bno);
	//수정 
	void update(FreeBoard freeBoard);
	//삭제
	void delete(int bno);
	
}
