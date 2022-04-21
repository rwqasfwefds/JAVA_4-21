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
			System.out.println(getTime() + "������ �غ�Ǿ����ϴ�.");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
//		Ŭ���̾�Ʈ�κ��� ���� ���
//		���� ���� : ���� ���� = ������ ��� ���ִ� ����, ��� ���� ��� ���μ���
		while(true) {
			try {
				System.out.println(getTime() + "���� ��û�� ��ٸ��ϴ�.");
				
//				Ŭ���̾�Ʈ�� ��Ĺ(ip, port)�� ����� �����ϴ� �κ�
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + socket.getInetAddress() + "�κ��� �����û�� ���Խ���.");
				
//				Output : �޼��� ������ ���� �κ�
//				��Ʈ�p ��Ŷ ������ ���� �غ� �ܰ�
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
//				writeUTF : ��Ʈ�p �޼����� �����ϴ� �޼ҵ�(���ڿ� �޼���)
				dos.writeUTF("[Notice] Test Message1 from Serve.");
				System.out.println(getTime() + "�����͸� �����߽���.");
				
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