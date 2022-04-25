<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	.star{
		color:#e74a4e;
	}
	.text__read {
		overflow-y: scroll; 
		height: 200px;
		padding : 5px;
		border:1px solid black;
		border-radius: 5px;
	}
</style>
</head>
<body>

	<!-- ���[����] �������� jsp -->
	<%@include file="header.jsp" %>
		
	
	<br><br><br><br><br><br>
	
		<div id="signup" class="container">
		<div class="col-md-12 row">
			<div class="col-md-6 my-3">
				<div>
					<h4>ȸ������ �� �������� ���� �̿��� ���� �Ʒ� ����� �о� ���ð�,<br> ���� ���θ� ������ �ּ���.</h4>
					<p>�ʼ� ����� ���� �ϼž� ȸ�������� �����մϴ�.</p>
				</div>
					<hr>
				<div>
					<h2>ȸ������ �������<b class="star">*</b></h2>
				</div>
				<div>
					<textarea rows="10" cols="" class="form-control"> 			
						�������� ȯ���մϴ�.
							
						���̹� ���� �� ��ǰ(���� �����񽺡�)�� �̿��� �ּż� �����մϴ�.
						�� ����� �پ��� ���̹� ������ �̿�� �����Ͽ� ���̹� ���񽺸� �����ϴ� ���̹� �ֽ�ȸ��(���� �����̹���)�� �̸� �̿��ϴ� ���̹� ���� ȸ��(���� ��ȸ����) �Ǵ� ��ȸ������ ���踦 �����ϸ�,
						�ƿ﷯ �������� ���̹� ���� �̿뿡 ������ �� �� �ִ� ������ ������ �����ϰ� �ֽ��ϴ�.		
						���̹� ���񽺸� �̿��Ͻðų� ���̹� ���� ȸ������ �����Ͻ� ��� �������� �� ��� �� ���� � ��å�� Ȯ���ϰų� �����ϰ� �ǹǷ�, 
						��� �ð��� ���þ� ���� ��� ����� �ֽñ� �ٶ��ϴ�.
						�پ��� ���̹� ���񽺸� ��ܺ�����.
						���̹��� www.naver.com�� ����� ���̹� �������� ������Ʈ �� �������α׷�(���ø����̼�, ��)�� ���� ���� �˻�,
						�ٸ� �̿��ڿ��� Ŀ�´����̼�, ������ ����, 
						��ǰ ���� �� �������� ��Ȱ�� ������ ���� �� �ִ� �پ��� ���񽺸� �����ϰ� �ֽ��ϴ�.
						�������� PC, �޴��� �� ���ͳ� �̿��� ������ ���� �ܸ��⸦ ���� ���簢���� ���̹� ���񽺸� �����Ӱ� �̿��Ͻ� �� ������, 
						���� ���񽺵��� ��ü���� ������ �� ���� ���� �ȳ�, ��������, ���̹� ��������(���� �������͡�) ���� ��� ���� Ȯ���Ͻ� �� �ֽ��ϴ�.
						</textarea>
					</div>
					<div class="form-check py-3">
						<input type="checkbox"> ȸ������ ��� �����մϴ�.
					</div>
					<hr>
					<div>
				</div>
					<h2>��������ó����ħ<b class="star">*</b></h2>
					
				<div>
					<textarea rows="10" cols="" class="form-control">
							�������� ȯ���մϴ�.
									
							���̹� ���� �� ��ǰ(���� �����񽺡�)�� �̿��� �ּż� �����մϴ�.
							�� ����� �پ��� ���̹� ������ �̿�� �����Ͽ� ���̹� ���񽺸� �����ϴ� ���̹� �ֽ�ȸ��(���� �����̹���)�� �̸� �̿��ϴ� ���̹� ���� ȸ��(���� ��ȸ����) �Ǵ� ��ȸ������ ���踦 �����ϸ�,
							�ƿ﷯ �������� ���̹� ���� �̿뿡 ������ �� �� �ִ� ������ ������ �����ϰ� �ֽ��ϴ�.		
							���̹� ���񽺸� �̿��Ͻðų� ���̹� ���� ȸ������ �����Ͻ� ��� �������� �� ��� �� ���� � ��å�� Ȯ���ϰų� �����ϰ� �ǹǷ�, 
							��� �ð��� ���þ� ���� ��� ����� �ֽñ� �ٶ��ϴ�.
							�پ��� ���̹� ���񽺸� ��ܺ�����.
							���̹��� www.naver.com�� ����� ���̹� �������� ������Ʈ �� �������α׷�(���ø����̼�, ��)�� ���� ���� �˻�,
							�ٸ� �̿��ڿ��� Ŀ�´����̼�, ������ ����, 
							��ǰ ���� �� �������� ��Ȱ�� ������ ���� �� �ִ� �پ��� ���񽺸� �����ϰ� �ֽ��ϴ�.
							�������� PC, �޴��� �� ���ͳ� �̿��� ������ ���� �ܸ��⸦ ���� ���簢���� ���̹� ���񽺸� �����Ӱ� �̿��Ͻ� �� ������, 
							���� ���񽺵��� ��ü���� ������ �� ���� ���� �ȳ�, ��������, ���̹� ��������(���� �������͡�) ���� ��� ���� Ȯ���Ͻ� �� �ֽ��ϴ�.
													</textarea>
					</div>
					<div class="form-check py-3">
						<input type="checkbox"> �������� ó�� ��ħ ���� �մϴ�.
					</div>
				</div>
			<div class="col-md-6 my-3">
				<form action="" method="get">
					<div>
						<input type="text" class="form-control py-3" placeholder="���̵� �Է��ϼ���" maxlength="10">
					</div>
					<br>
					<div>
						<input type="password" class="form-control py-3" placeholder="��й�ȣ�� �Է��ϼ���" maxlength="4">
					</div>
					<br>
					<div>
						<input type="password" class="form-control py-3" placeholder="�ѹ��� ��й�ȣ�� �Է��ϼ���" maxlength="4">
					</div>
					<br>
					<div>
						<input type="text" class="form-control py-3" placeholder="�̸��� �Է��ϼ���" maxlength="10">
					</div>
					<div class="text-center">
						<div class="form-check py-3">
							<input type="radio"> ����
							<input type="radio"> ����
						</div>
					</div>
					<div>
						<input type="text" class="form-control py-3" placeholder="����ó�� �Է��ϼ���" maxlength="10">
					</div>
					<br>
					<div>
						<input type="email" class="form-control py-3" placeholder="�̸����� �Է��ϼ���" maxlength="10">
					</div>
					<br>
					<div>
						<input type="text" class="form-control py-3" placeholder="���̸� �Է��ϼ���" maxlength="10">
					</div>
				</form>
				<br>

			<!-- ���� -->
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-4">�ּ�<b class="star">*</b></div>
					
					<div class="col-md-8">
						<div class="row">
							<div class="col-md-6">
								<input type="text" placeholder="�����ȣ" class="form-control py-3">
								<input type="text" placeholder="���θ��ּ�" class="form-control my-3 py-3">
							</div>
							<div class="col-md-6">
								<input type="button" value="�����ȣ ã��" class="form-control py-3">
								<input type="text" placeholder="�����ּ�" class="form-control my-3 py-3">
							</div>
						</div>
						<input type="text" placeholder="���ּ�" class="form-control my-3 py-3">
					</div>
				</div>
				<input type="button" value="ȸ������" class="form-control py-3">
			</div>





			</div>
		</div>
	</div>
	
	
	
	<%@include file = "footer.jsp" %>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>