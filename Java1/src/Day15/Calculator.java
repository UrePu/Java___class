package Day15;

public class Calculator {
	
	// �ʵ�
	private int memory;
	// �޼ҵ�
	public int getMemory() {
		return memory;
	}
	// �޼ҵ�
		// ������ : ������1�� 100 �ְ� (  ������2�� 50 �ְ� [ �� ���� ]  ) 100���
		// �����ذ�[ synchronized : ����ȭ ]
				// ������1�� 100 �ְ� ( ������2�� ����� ) 100���
					// ������2�� ������1�� �޼ҵ����ᰡ �ɶ����� ������
	public void setMemory( int memory) {
		this.memory = memory;
		// 2�ʰ� �Ͻ�����;
		try{ Thread.sleep(2000); }
		catch( Exception e ) {}
		// memory ���
	System.out.println( 
			Thread.currentThread().getName()+
			":"+this.memory);
	}

}







