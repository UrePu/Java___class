package Day15_1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Controller {
	
	// 1. �迭 ��� 
	//public static Car[] carlist = new Car[100];
	// 2. ����Ʈ ���
	public static ArrayList<Car> carlist = new ArrayList<>(); 

	static LocalDate ld = LocalDate.now();
	static LocalTime lt = LocalTime.now();
	
	// ���� �޼ҵ� 
	public static boolean ����( String ������ȣ ) {
		// ���� �ڵ� �ۼ� 
			// 1. �Է¹��� ������ȣ(�μ�) �����´�.
			// * ������ȣ �ߺ�üũ
			for(Car temp : carlist) {
				if(temp != null) {
					if(temp.get������ȣ().equals(������ȣ)) {
						return false;
					}
				}
			}
			// 2. ������¥(���糯¥) �� ���Ѵ�( ????? : )
			
			// 3. �����ð�(����ð�) �� ���Ѵ�( ????? : )
			
			// * �����ð� , �ݾ��� ������ x 
			Car ���� = new Car(ld, ������ȣ, lt);
			// 4. ������ȣ,������¥,�����ð� => 3������ -> 1��üȭ
			carlist.add(����);
			// 5. ������ü�� �迭�̳� ����Ʈ �� ���� 
		return true;
	}
	// ���� �޼ҵ� 
	public static boolean ����( String ������ȣ ) {
		// ���� �ڵ� �ۼ�
			// 1. �Է¹��� ������ȣ(�μ�) �����´�.
			// 2. �迭 or ����Ʈ�� ������ ������ȣ�� ã�Ƽ�
		
		for(Car temp : carlist) {
			if(temp != null) {
				if(temp.get�����ð�() !=null) {
					return false;
				}
				if(temp.get������ȣ().equals(������ȣ)) {
					long �����ð� =  ChronoUnit.MINUTES.between(temp.get�����ð�(), lt);
					int �ݾ� = 0;
					if(�����ð� >= 30) {
						�ݾ� = ( (int)((�����ð�-30) / 10 ) * 1000);
					}
					temp.set�����ð�(lt);
					temp.set�ݾ�(�ݾ�);
					return true;
				}
			}
		}
			// 3. �����ð�(����ð�) �� ���Ѵ� (????? : )
			// 4. ��� [ �����ð� - �����ð� => (��-30)/10 *1000  ]
			// 5. (����)ã�� ��ü�� ��ð��� �ݾ��� �����Ѵ�.
		return false;
	}
	public static boolean �����׽�Ʈ( String ������ȣ, int �������� ) {
		// ���� �ڵ� �ۼ�
			// 1. �Է¹��� ������ȣ(�μ�) �����´�.
			// 2. �迭 or ����Ʈ�� ������ ������ȣ�� ã�Ƽ� 



		for(Car temp : carlist) {
			if(temp != null) {
				if(temp.get������ȣ().equals(������ȣ)) {
					if(temp.get�����ð�() !=null) {
						return false;
					}
					long �����ð� =  ChronoUnit.MINUTES.between(temp.get�����ð�(), lt.plusMinutes(��������));
					int �ݾ� = 0;
					if(�����ð� >= 30) {
						�ݾ� = ( (int)((�����ð�-30) / 10 ) * 1000);
					}
					temp.set�����ð�(lt.plusMinutes(��������));
					temp.set�ݾ�(�ݾ�);
					return true;
				}
			}
		}
			// 3. �����ð�(����ð�) �� ���Ѵ� (????? : )
			// 4. ��� [ �����ð� - �����ð� => (��-30)/10 *1000  ]
			// 5. (����)ã�� ��ü�� ��ð��� �ݾ��� �����Ѵ�.
		return false;
	}
	
}
