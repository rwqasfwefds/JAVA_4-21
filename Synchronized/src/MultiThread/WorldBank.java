package MultiThread;

public class WorldBank implements Runnable{
	Account acc = new Account(); // ����

	@Override
	public void run() {
//		�ܾ��� > 0 ���� �ݺ�
		while(acc.balance > 0) {
			int money = 100; // 100�� ���
			acc.withDraw(money); // ��� �޼ҵ� ȣ��
//			���� �ܾ� ���
			System.out.println("�ܾ�(" + Thread.currentThread().getName() + ") : " + acc.balance);
		}
	}
}