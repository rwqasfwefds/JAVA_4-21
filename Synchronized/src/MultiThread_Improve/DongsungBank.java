package MultiThread_Improve;

public class DongsungBank implements Runnable{
	Account acc = new Account(); // 통장

	@Override
	public void run() {
//		잔액이 > 0 동안 반복
		while(acc.balance > 0) {
			int money = 100; // 100원 출금
			acc.withDraw(money); // 출금 메소드 호출
//			현재 잔액 출력
			System.out.println("잔액(" + Thread.currentThread().getName() + ") : " + acc.balance);
		}
	}
}
//	0이 2번 찍히는데 이게 왜 그렇냐면
//	현재 run메소드에서 lock이 acc.wirhDraw(money) 메소드만 걸려있잖슴?
//	그러면 이 run메소드 자체는 번갈아가면서 실행이 가능 하잖아
//	그러니깐 만약 0번 쓰레드가 acc.wirhDraw(money)얘를 실행하고 있으면
//	1번 쓰레드는 저 메소드를 실행 못 하잖아
//	그러면 1번 쓰레드는 그냥 기다리느냐? 아니란 말이지
//	그냥 밑에걸 냅다 실행해 버리는거지
//	그니깐 0번 쓰레드가 저걸 처리했는데 0이 나왔어 근데 이미 1번 쓰레드가 run메소드에 들어와있어
//	그러면 0번 쓰레드는 정상적으로 처리해서 0을 찍는데
//	그 와중에 1번 쓰레드는 run  메소드에 들어와가지고 실행을 하는거지
//	근데 1번 쓰레드가 acc.wirhDraw(money) 를 실행할려고 하니깐 조건이 안 맞아서
//	그냥 밑에 출력하는걸 실행 한 거임ㅇㅇ