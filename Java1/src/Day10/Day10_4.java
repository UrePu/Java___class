package Day10;

import java.util.ArrayList;

public class Day10_4 {
	public static void main(String[] args) {
		String[] arr = new String[100];
		
		ArrayList<String> list = new ArrayList<>();
		//ArrayList �ڵ��ϼ�
		//<�ڷ���> 
		// Arraylist<>(); ������
		System.out.println("����Ʈ : " + list);
		list.add("���缮");
			//����Ʈ��.add: ����Ʈ�� ��ü �߰� �޼ҵ�
		System.out.println("����Ʈ[0]: " + list.get(0));
			//����Ʈ��.get: �ش� �ε����� ��ü ȣ�� �޼ҵ�
		System.out.println("���� :" + list.size());
		
		//�迭 ����: �޸� ũ��� ��������[�޸� ȿ���� ������]
			//ȸ�� �迭 100�� -> ���� 100�� �ʰ��ϸ� ���� �Ұ���
			//ȸ�� �迭 100�� -> ���� 1���̸� ������ 99�� �޸� ����
		
		//����Ʈ: �޸� ũ��� ��������[�޸� ȿ���� ����]
			//����Ʈ�� �⺻���� 10 -> ���� �߰��ϰų� �����ϸ� �ڵ����� �޸� �Ҵ�
		//		�迭(����) 	vs	����Ʈ(Ŭ����)
		//		�߰� �޼ҵ�x 	vs	�߰��޼ҵ� o
		//�߰�: 	�迭��[0]=�� 	vs 	����Ʈ��.add(��)
		//ȣ��:	�迭��[�ε���]	vs	����Ʈ��.get(�ε���)
		//����: 	null�Ҵ�		vs	����Ʈ��.remove(�ε���)
		//		1 null 3 	vs 		1 3
		//����: 	�迭��.length	vs 	����Ʈ��.size()
		
		
	}	
}
