package Ex13_13;

public class Account {
	int balance = 1000; // ���� �ܾ� 1000��
	
//	�޼ҵ� ���� : ���忡�� �� �����ϱ� �޼ҵ�
//	Lock ���� : synchronized ����� ����(ũ��Ƽ�� ���� �˰�����)

	public synchronized void withDraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println("������ �߻��߽���");
			}
			balance -= money;
		}
	}
}