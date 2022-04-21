package Ex13_12;

public class Account {
	int balance = 1000; // 통장 잔액 1000원
	
//	메소드 설명 : 통장에서 돈 인출하기 메소드
	public void withDraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println("에러가 발생했슴다");
			}
			balance -= money;
		}
	}
}
