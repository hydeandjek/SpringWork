package com.spring.myweb.freeboard.service;

import java.util.List;

import com.spring.myweb.freeboard.dto.page.Page;
import com.spring.myweb.freeboard.dto.request.FreeRegistRequestDTO;
import com.spring.myweb.freeboard.dto.response.FreeDetailResponseDTO;
import com.spring.myweb.freeboard.dto.response.FreeListResponseDTO;
import com.spring.myweb.freeboard.dto.response.FreeUpdateResponseDTO;
import com.spring.myweb.freeboard.entity.FreeBoard;

public interface IFreeBoardService {


	//글등록
	void regist(FreeRegistRequestDTO dto);
	//글목록
	List<FreeListResponseDTO> getList(Page page);
	//상세보기
	FreeDetailResponseDTO getContent(int bno);
	//수정 
	void update(FreeUpdateResponseDTO dto);
	//삭제
	void delete(int bno);
	int getTotal(Page page);

}
