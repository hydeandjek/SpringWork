package com.spring.myweb.reply.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.myweb.freeboard.dto.page.Page;
import com.spring.myweb.reply.dto.ReplyListResponseDTO;
import com.spring.myweb.reply.dto.ReplyRegistDTO;
import com.spring.myweb.reply.entity.Reply;
import com.spring.myweb.reply.mapper.IReplyMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReplyService implements IReplyService {
	
	private final IReplyMapper mapper;
	private final BCryptPasswordEncoder encoder;
	
	@Override
	public void replyRegist(ReplyRegistDTO dto) {
		dto.setReplyPw(encoder.encode(dto.getReplyPw())); // 비밀번호 암호화
		mapper.replyRegist(dto.toEntity(dto));
	}

	@Override
	public List<ReplyListResponseDTO> getList(int bno, int pageNum) {
		Page page = Page.builder()
				.pageNo(pageNum)
				.amount(5)
				.build();
		Map<String, Object> map = new HashMap<>();
		map.put("paging",page);
		map.put("boardNo",bno);
		
		List<ReplyListResponseDTO> dtoList = new ArrayList<>();
		for (Reply reply : mapper.getList(map) ) {
			dtoList.add(new ReplyListResponseDTO(reply));
		}
		return dtoList;
	}

	@Override
	public int getTotal(int bno) {
		return mapper.getTotal(bno);
	}

	@Override
	public String pwCheck(int rno) {
		return null;
	}

	@Override
	public void update(Reply reply) {

	}

	@Override
	public void delete(int rno) {
		// TODO Auto-generated method stub

	}

}
