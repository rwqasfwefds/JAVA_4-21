package MultiThread_Improve;

public class BankTest {

	public static void main(String[] args) {
		DongsungBank r = new DongsungBank(); // 동성뱅크 생성
		
		Thread t1 = new Thread(r); // 1st 쓰레드
		Thread t2 = new Thread(r); // 2nd 쓰레드
		
		t1.start();
		t2.start();
	}

}
