package Day08;

public class Person {
	//static + final : ��ü ���� ���α׷� ���������� ���Ǵ� ���
	static final double pi =3.14;
	// static : ��ü ���� ���α׷� ���������� ���Ǵ� ����
	static double pi2 = 3.14;
	//final : ��ü������ ���Ǵ� ���
	final double pi3 = 3.14;
	//1. �ʵ�
	String nation = "Korea";
	String ssn;
	String name;
	//2. ������
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		
	}
}
