package MultiThread_Improve;

public class DongsungBank implements Runnable{
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
//	0�� 2�� �����µ� �̰� �� �׷��ĸ�
//	���� run�޼ҵ忡�� lock�� acc.wirhDraw(money) �޼ҵ常 �ɷ����ݽ�?
//	�׷��� �� run�޼ҵ� ��ü�� �����ư��鼭 ������ ���� ���ݾ�
//	�׷��ϱ� ���� 0�� �����尡 acc.wirhDraw(money)�긦 �����ϰ� ������
//	1�� ������� �� �޼ҵ带 ���� �� ���ݾ�
//	�׷��� 1�� ������� �׳� ��ٸ�����? �ƴ϶� ������
//	�׳� �ؿ��� ���� ������ �����°���
//	�״ϱ� 0�� �����尡 ���� ó���ߴµ� 0�� ���Ծ� �ٵ� �̹� 1�� �����尡 run�޼ҵ忡 �����־�
//	�׷��� 0�� ������� ���������� ó���ؼ� 0�� ��µ�
//	�� ���߿� 1�� ������� run  �޼ҵ忡 ���Ͱ����� ������ �ϴ°���
//	�ٵ� 1�� �����尡 acc.wirhDraw(money) �� �����ҷ��� �ϴϱ� ������ �� �¾Ƽ�
//	�׳� �ؿ� ����ϴ°� ���� �� ���Ӥ���