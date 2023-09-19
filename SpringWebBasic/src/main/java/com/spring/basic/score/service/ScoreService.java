package com.spring.basic.score.service;

import org.springframework.stereotype.Service;

import com.spring.basic.score.dto.ScoreRequestDTO;

//컨트롤러와 레파지토리 사이에 배치되어 기타 비즈니스 로직 처리
//ex)값을 가공, 예외처리 , dto로 변환, 트랜잭션등등....
@Service //빈 등록
public class ScoreService {
	
	//등록의 중간처리
	public void insertScore(ScoreRequestDTO dto) {
		
	}
	
	
}
