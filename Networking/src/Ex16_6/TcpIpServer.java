package Ex16_6;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime() + "서버가 준비되었습니다.");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
//		클라이언트로부터 응답 대기
//		무한 루프 : 데몬 형태 = 서버가 계속 떠있는 상태, 계속 실행 대기 프로세스
		while(true) {
			try {
				System.out.println(getTime() + "연결 요청을 기다립니다.");
				
//				클라이언트가 소캣(ip, port)을 만들면 연결하는 부분
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + socket.getInetAddress() + "로부터 연결요청이 들어왔슴다.");
				
//				Output : 메세지 전송을 위한 부분
//				네트웤 패킷 전송을 위한 준비 단계
//				걍 둘 다 같은 개념
//				OutputStream 요새끼는 박스만들고
//				DataOutputStream 요새끼는 포장하고
//				걍 똑같다 ㅇㅇ
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
//				writeUTF : 네트웤 메세지를 전송하는 메소드(문자열 메세지)
				dos.writeUTF("[Notice] Test Message1 from Serve.");
				System.out.println(getTime() + "데이터를 전송했슴다.");
				
				dos.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}

}
