package Day01;

public class Day01_2 { //c s
	//1. ���
		//1. print() : ��¸�
		//2. println() : ����� �ٹٲ� ����
		//3. printf() : ��¿� �ٹ̱� ����
			//����
				// %s : ���ڿ� ���� �ڸ�
				// %d : ���� ���� �ڸ� 
				// %f : �Ǽ� �����ڸ�
			//���� [ \ : �������� ��ȭ��ȣ]
				// \n : �ٹٲ�
				// \t : �鿩���� [5������]
				// \\ : �齽 ���
				// \", \' : ū����ǥ , ���� ����ǥ ���
	//1. System : �ý��� Ŭ���� [ ����� ���� ������� �ڵ� ���� ]
	//2. out : ��� ��Ʈ��
	//3. print() : ��� �Լ� 
	//4 ; : ���� �ڵ��� ���� �˸�
	//* �ý��� Ŭ������ out �̶�� ��� ��Ʈ���� ���� print �Լ��� ����ؼ�
	// console�� ���ϴ´�� ����� �� �ִ�.
	
	public static void main(String[] args) { //main s
		//1. �⺻���
		System.out.print("aaaa");	// ; : �ڵ� ���� ����
		System.out.print("bbbb"); 	// ���� " " ó��
		System.out.print("cccc");	// ���� " " ó�� x
		System.out.print("dddd");
			//* �̸� ������� �ܾ� [ ����� ] �� ������ ��� ���ڴ� " " ó��
				//�̸� ������� �ܾ� : ���̺귯���� �ִ°�
		//2. �ڵ��ϼ� ( syso + ctrl + space ) 
		System.out.println("eeee");
		System.out.println("ffff");
		System.out.println("gggg");
		
		//3. ���� ���
		System.out.printf("%s", "�ϰ����������");
		System.out.printf("java %d����", 1);
		System.out.printf("%d", 123124);
		
		// ���� 1 [ �⼮�� ]
		
		System.out.println("\n\t\t[�⼮��]");
		System.out.println("-----------------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����\t���");
		System.out.println("��ȣ��\t�⼮\t�Ἦ\t�⼮");
		System.out.println("���缮\t�⼮\t�⼮\t�⼮");
		System.out.println("-----------------------------------------");
		
		//���� 2  [ ���� 1 -> printf ]
		System.out.printf("\n\t\t%s", "[�⼮��]\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s\t%s\t%s\t%s\t%s", "�̸�", "1����", "2����", "3����", "���\n");
		System.out.printf("%s\t%s\t%s\t%s", "��ȣ��", "�⼮", "�Ἦ", "�⼮\n");
		System.out.printf("%s\t%s\t%s\t%s", "���缮", "�⼮", "�Ἦ", "�⼮\n");
		
		// ����1 : �����
		System.out.println("\t �����");
		System.out.println("\t\\    /\\");
		System.out.println("\t )  ( \')");
		System.out.println("\t(  /  )");
		System.out.println("\t \\(__)|");
		
		System.out.println("\n\t ������");
		System.out.println("\t|\\_/|");
		System.out.println("\t|q p|    /}");
		System.out.println("\t( 0 ) \"\"\"\\");
		System.out.println("\t|\"^\"`    |");
		System.out.println("\t||_/=\\\\__|");
	} // main e
} // c e
