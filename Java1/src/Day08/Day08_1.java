package Day08;

public class Day08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p.238: static
		// ��������
		// �������� ������ = ���α׷� ���������� ���Ǵ� �޸�
		
		// * Ŭ���� ���ʵ�, �޼ҵ�(���) ���� ���.
			//1. (static ����� �ƴҶ�)��ü ���� -> ��ü.���
				// ��ü�� �����ɶ� new �����ڷ� ��ü(�� ��� ����) �޸� �Ҵ�
		
		Calculator calc = new Calculator();
		
		System.out.println("��ü�� �̿��� ��� ���� : " + calc.pi);
			//(static ��� �϶�) 1. Ŭ������.���
		
		System.out.println("��ü ���� ��� ����: " + Calculator.pi);
		
		double result = 10 * 10 * Calculator.pi;
		
		int result2 = Calculator.plus(10, 5);
		System.out.println("result2: " +result2);
		int result3 = Calculator.minus(10, 5);
		System.out.println("result3: " +result3);
	}

}
