package MultiThread;

public class Account {
	int balance = 1000; // 통장 잔액 1000원
	
//	메소드 설명 : 통장에서 돈 인출하기 메소드
//	지금 호출 하는 곳에서 병렬 처리를 하는거니깐
//	-100이 나올 수 있음
//	왜 나오느냐 병렬처리면 왔다갔다 처리 하는데
//	하필이면 1번 쓰레드가 if문을 딱 조건문만 보고 실행했는데
//	2번 쓰레드가 갑자기 들어온거임 근데 2번 쓰레드는 밑에걸 다 처리해버렸음
//	그럼 1번 쓰레드는 2번 쓰레드가 다 처리하고 난 뒤에 또 처리하는거라서 그럼 ㅋ
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
