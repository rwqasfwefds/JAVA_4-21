package MultiThread;

public class Account {
	int balance = 1000; // ���� �ܾ� 1000��
	
//	�޼ҵ� ���� : ���忡�� �� �����ϱ� �޼ҵ�
//	���� ȣ�� �ϴ� ������ ���� ó���� �ϴ°Ŵϱ�
//	-100�� ���� �� ����
//	�� �������� ����ó���� �Դٰ��� ó�� �ϴµ�
//	�����̸� 1�� �����尡 if���� �� ���ǹ��� ���� �����ߴµ�
//	2�� �����尡 ���ڱ� ���°��� �ٵ� 2�� ������� �ؿ��� �� ó���ع�����
//	�׷� 1�� ������� 2�� �����尡 �� ó���ϰ� �� �ڿ� �� ó���ϴ°Ŷ� �׷� ��
	public void withDraw(int money) {
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