package Ex13_12;

public class BankTest {

	public static void main(String[] args) {
		WorldBank r = new WorldBank(); // �����ũ ����
		
		Thread t1 = new Thread(r); // 1st ������
		Thread t2 = new Thread(r); // 2nd ������
		
		t1.start();
		t2.start();
	}

}
