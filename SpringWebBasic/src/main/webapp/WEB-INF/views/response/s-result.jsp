<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 class = "result-title">
		<%-- <c:if test="${result == 'f-id' }">아이디가 존재하지 않습니다.</c:if>
		<c:if test="${result == 'f-pw' }">비밀번호가 틀렸어요~</c:if>
		<c:if test="${result == 'success' }">로그인 성공!</c:if> --%>
	</h1>
	
	<script>
	/*
	 브라우져가 HTML을 해석하고 , css를 해석하고 , javascript코드를 실행해서 화면에 표현하는
	 과정을 렌더링이라고한다.
	 지금우리가 작성하는 파일형태 - > jsp-> 서버내에서 클래스로 변환->응답은 HTML
	 jsp파일이 클래스로 변화하는 과정에서 작성한 EL문법은 자바 코드로 변환->값을 표현
	 ->응답은 HTML로 표현.
	 EL표현식이 서버에서 먼저 평가되고 그 결과를 클라이언트에게 전달하여 브라우저로 표현하기때문에
	 script에서도 EL표현이 가능합니다.
	 javaScript에서 EL표현식을 사용할때는 문자열로 감사주어야한다.
	*/
	
		const result = '${result}'
	//	console.log('result :'+result);
		const $h1 = document.querySelector(".result-title");
		switch(result){
		case 'f-id':
			$h1.textContent = '아이디가 존재하지 않습니다.';
			break;
		case 'f-pw':
			$h1.textContent = '비밀번호가 틀렸습니다.';
			break;
		case 'success':
			$h1.textContent = '로그인 성공!';
			break;
		}
	</script>
</body>
</html>