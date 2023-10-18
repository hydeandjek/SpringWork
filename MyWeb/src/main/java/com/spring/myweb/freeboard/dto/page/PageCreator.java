package com.spring.myweb.freeboard.dto.page;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class PageCreator {

	//한 화면에 배치할 버튼 개수
	private static final int BUTTON_NUM = 5;
	
	//화면 렌더링 시 페이지의 시작 값과 끝값.
	private int begin,end;
	
	//이전, 다음 버튼 활성화 여부
	private boolean prev,next;
	
	//총 게시물 수
	private int articleTotalCount;
	
	//현재 요청 페이지 정
	private Page page;
	
	// 페이징 알고리즘을 수행하기 위해 외부로부터 필요한 데이터를 전달받음.
	public PageCreator(Page page, int articleTotalCount) {
		this.page = page;
		this.articleTotalCount = articleTotalCount;
		calcDataOfPage();
	}
	
	private void calcDataOfPage() {
		
		//끝 페이지 계산
		this.end =(int)(Math.ceil(page.getPageNo()/(double)BUTTON_NUM)*BUTTON_NUM);
		
		//시작 페이지 계산
		this.begin =this.end - BUTTON_NUM+1;
		
		this.prev = begin>1;
		
		this.next = articleTotalCount <= (end*page.getAmount()) ? false : true;
		
		if(!this.next) {
			this.end = (int) (Math.ceil(articleTotalCount)/(double)page.getAmount());
		}
		
	}
	
}
