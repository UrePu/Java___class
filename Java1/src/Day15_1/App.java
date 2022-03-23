package Day15_1;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			try {
		
				LocalDate ld = LocalDate.now();
				LocalTime lt = LocalTime.now();
				System.out.println("----------------------���� ��Ȳ ǥ----------------------");
				System.out.println("\t\t���� �ð�: " + ld + " " + lt.getHour() + ":" + lt.getMinute());
				System.out.println();
				System.out.println("   ��¥\t     ������ȣ\t�����ð�\t �����ð�\t �ݾ�");
				for(Car temp : Controller.carlist) {
					if(temp != null) {
						
						if(temp.get�����ð�() == null && temp.get������ȣ() != null) {
							System.out.println(temp.get��¥() + "  " + temp.get������ȣ() + "    "
							+ temp.get�����ð�().format(DateTimeFormatter.ofPattern("hh:mm"))+ "\t ���� ��\t ���� ��"
							);
						}else if(temp.get�����ð�() != null && temp.get������ȣ() != null) {
							DecimalFormat decFormat = new DecimalFormat("###,###");
							String str = decFormat.format(temp.get�ݾ�());
							System.out.println(temp.get��¥() + "  " + temp.get������ȣ() + "    "
							+ temp.get�����ð�().format(DateTimeFormatter.ofPattern("hh:mm")) + 
							"\t "+temp.get�����ð�().format(DateTimeFormatter.ofPattern("hh:mm"))+"\t"+str
							);
						}
					}
				}
				///	
				
				System.out.println();
				System.out.println("------------------------------------------------------");
				System.out.println("\t1.����\t2.����\t3.�����׽�Ʈ��");
				int ch = scanner.nextInt();
			
				if( ch == 1 ) {
					// 1. ������ȣ�� �Է¹޴´�.
						// �Է� 
					// 2. �Է¹��� ������ȣ�� ��Ʈ�ѳ� �޼ҵ� ���� �ѱ��.
					// 3. �޼ҵ� ��� �� ���� ��� 
					System.out.println("������ �����ϼ̽��ϴ�.");
					System.out.println("���� ��ȣ�� �Է��� �ּ���");String ������ȣ = scanner.next();
					boolean ��� = Controller.����(������ȣ);
					if(���) System.out.println("���������� ���� �Ϸ�Ǿ����ϴ�");
					else System.err.println("�̹� ������ �����Դϴ�.");
				}else if( ch == 2 ){
					// 1. ������ȣ�� �Է¹޴´�.
						// �Է�
					// 2. �Է¹��� ������ȣ�� ��Ʈ�ѳ� �޼ҵ� ���� �ѱ��.
					// 3. �޼ҵ� ��� �� ���� ���
					System.out.println("������ �����ϼ̽��ϴ�.");
					System.out.println("���� ��ȣ�� �Է��� �ּ���");String ������ȣ = scanner.next();
					boolean ��� = Controller.����(������ȣ);
					if(���)System.out.println("��������");
					else System.err.println("�̹� ������ �����Դϴ�");

				}else if( ch == 3 ){
						// 1. ������ȣ�� �Է¹޴´�.
						// �Է�
					// 2. �Է¹��� ������ȣ�� ��Ʈ�ѳ� �޼ҵ� ���� �ѱ��.
					// 3. �޼ҵ� ��� �� ���� ���
					System.out.println("������ �����ϼ̽��ϴ�.");
					System.out.println("���� ��ȣ�� �Է��� �ּ���");String ������ȣ = scanner.next();
					System.out.println("��еڿ� �������� ����: "); int �����ð����� = scanner.nextInt();
					
					boolean ��� = Controller.�����׽�Ʈ(������ȣ,�����ð�����);

					if(���)System.out.println("��������");
					else System.err.println("�̹� ������ �����Դϴ�");
			}


				else System.out.println("1���� 2���߿� ����ּ���.");
				}catch (Exception e){
					scanner.next();
					System.out.println("����");
				}
			
			
		}
		
	} // 
} // 
