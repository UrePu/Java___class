package Day03;

public class Day03_1 { //c s
	
	public static void main(String[] args) {// m s
		
		//1���� : ���, �Է�
		//2���� : ����, ���
		//��� 
			// ��ǻ���� �Ǵܷ� -> ����� ��
			// ���ǽ��� true �̸� ���๮ ó��.
			// ����
				//1. IF(���ǽ�[true/false]) ���๮;
				//2. IF(���ǽ�) ���๮[��];
					//ElSE ���๮[����]
				//3. ���๮�� 2�� �̻��϶�.
				//4. if(����1) {���๮ [��1];}
				//	 else if (����2) {���๮ [��2];}
				//   else if (����3) {���๮ [��3];}
				//	 else if (����4) {���๮ [��4];}
				//   else if (����5) {���๮ [��5];}
				//	 else {���๮[����];}
		
		
		//����1
		if (3>1) System.out.println("3�� 1���� ũ��.");
			//���࿡ 3�� 1���� ũ�� ���o �ƴϸ� ���x
		if(3>5) System.out.println("3�� 5���� ũ��.");
			//���࿡ 3�� 5���� ũ�� ���o �ƴϸ� ���x
		if(3>1) System.out.println("3_1 3�� 1���� ũ�� ");
		else System.out.println("3_2 3�� 1���� �۴�");
			//���࿡ 3�� 1���� ũ�� 3_1 ��� �ƴϸ� 3_2 ���
		
		if(3>2) { //true ���� ����
			System.out.println("true");
			System.out.println("3�� 2���� ũ��.");
		} //true ���� ��
		else { //false ���๮ ����
			System.out.println("false");
			System.out.println("3�� 2���� �۴�.");
				
		} //false ���๮ ��
		
		if (3 > 5) System.out.println("3�� 5���� ũ��"); 			//����x
		else if (3 > 4 ) System.out.println("3�� 4���� ũ��");		//����x
		else if (3 > 3 ) System.out.println("3�� 3���� ũ��");		//����x
		else if (3 > 2) System.out.println("3�� 2���� ũ��");		//����o
		else System.out.println("true ����.");					//����x
		
		if (3 > 5) System.out.println("3�� 5���� ũ��"); 		//����x
		if (3 > 4 ) System.out.println("3�� 4���� ũ��");		//����x
		if (3 > 3 ) System.out.println("3�� 3���� ũ��");		//����x
		if (3 > 2) System.out.println("3�� 2���� ũ��");		//����o
		if (3 < 2) System.out.println("true ����.");			//����x
		//�� �ΰ� ���� ������ ������ 1���� ȿ���� �� ����
		
	}//m e

}//m e
