<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
.main__container{
	width:1004px;
	margin:0px auto;
	text-aling:center;
	margin-bottom: 50px;
}
.main__top{
	display:flex;
	justify-content: space-between;
	margin-bottom:40px;
}
.bottom__img img {
	width:250px
}
.main__bottom {
	width:250px;
	display:flex;
}
</style>
</head>
<body>
<div class="main__container">
	<div class="main__top">
		<img src="./img/icon1.png">
		<div><span>예약 안내</span><br>스튜디오 대여는 사전에 인터넷 예약을 하셔야 합니다.<br> 예약은 1일 이전까지 가능합니다.</div>
		<img src="./img/icon2.png" style="margin-left:30px;">
		<div><span>포토 갤러리</span><br>취업사진, 가족사진, 프로필 사진 등 개인 또는 단체가 <br>이용할 수 있습니다.</div>
	</div>
	<div class="main__bottom">
	<div class="bottom__img"><img src="./img/image1.jpg"><br><b>촬영 스튜디오</b><br>카메라,조형 등 촬영 장비 완비</div>
	<div class="bottom__img"><img src="./img/image2.jpg"><br><b>촬영 스튜디오</b><br>카메라,조형 등 촬영 장비 완비</div>
	<div class="bottom__img"><img src="./img/image3.jpg"><br><b>촬영 스튜디오</b><br>카메라,조형 등 촬영 장비 완비</div>
	<div class="bottom__img"><img src="./img/image4.jpg"><br><b>촬영 스튜디오</b><br>카메라,조형 등 촬영 장비 완비</div>
	
	</div>
</div>
</body>
</html>