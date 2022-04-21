package MultiThread_Improve;

public class Account {
	int balance = 1000; // ���� �ܾ� 1000��
	
//	�޼ҵ� ���� : ���忡�� �� �����ϱ� �޼ҵ�
//	Lock ���� : synchronized ����� ����(ũ��Ƽ�� ���� �˰���)
//	��Ƽ �������� �� �ϳ��� �����尡 �� ����� �� ������ �ǰ���
//	�ٸ� �����尡 ������ �ǰԱ� ����
//	�״ϱ� ������ ���鼭 �����ϴ��� 1�� �����尡 �� ����� �����ϴ� ���̸�
//	2�� �����尡 �� ���� ó�� �� ������ ���ϰ� 1�� �����尡 �� ���� �� ���� ��ٸ���
//	�� ������ ���� �� �� ����
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
