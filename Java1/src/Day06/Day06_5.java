package Day06;

public class Day06_5 {

	public static void main(String[] args) {
		Korean k1 = new Korean();
		
			k1.name = "��";
			k1.ssn = "012312-1233";
			System.out.println("k1 ����: " +k1.nation);
			System.out.println("k1 �̸�: " +k1.name);
			System.out.println("k1 �ֹι�ȣ: " +k1.ssn);
			
		Korean k2 = new Korean("��", "123-123");
		System.out.println("k2 ����: " +k2.nation);
		System.out.println("k2 �̸�: " +k2.name);
		System.out.println("k2 �ֹι�ȣ: " +k2.ssn);
		/////////
			//������� ��ü
		Korean �ѱ���1 = new Korean();
			//�ʵ� 1�� ������ ��ü ����
		Korean �ѱ���2 = new Korean("�̸�1");
			//�ʵ� 2�� ������ ��ü ����
		Korean �ѱ���3 = new Korean("�̸�2", "01001-001011");
	}
}
