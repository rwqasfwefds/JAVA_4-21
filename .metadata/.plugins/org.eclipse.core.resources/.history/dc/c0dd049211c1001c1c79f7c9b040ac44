package MultiThread_Improve;

public class Account {
	int balance = 1000; // 통장 잔액 1000원
	
//	메소드 설명 : 통장에서 돈 인출하기 메소드
//	Lock 설정 : synchronized 예약어 설정(크리티컬 섹션 알고리즘)
//	멀티 쓰레드일 때 하나의 쓰레드가 이 펑션이 다 실행이 되고나서
//	다른 쓰레드가 실행이 되게금 만듦
//	그니깐 번갈아 가면서 실행하더라도 1번 쓰레드가 이 펑션을 실행하는 중이면
//	2번 쓰레드가 전 예제 처럼 막 들어오지 못하고 1번 쓰레드가 다 끝날 때 까지 기다리고
//	그 다음에 실행 할 수 있음
	public synchronized void withDraw(int money) {
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
