package Ex16_7;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

//	Ŭ���� ���� : �� �� �����ϰ� ��� Ȯ�� �� ����
public class TcpIpClient {

	public static void main(String[] args) {
		try {
			String serverIp = "127.0.0.1";
			
			System.out.println("������ �������Դϴ�. ����IP : " + serverIp);
			
//			������ �ּ�(ip�ּ� + 7777)�� �����ؼ� ���� ����
			Socket socket = new Socket(serverIp, 7777);
			
//			��Ʈ�p ��Ŷ ������ �޴� �κ��� �غ��ϴ� �ܰ�
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);

//			readUTF : ���� ��Ʈ������ ���� �޼����� �д� �޼ҵ�(���ڿ�)
			System.out.println("�����κ��� ���� �޼��� : " + dis.readUTF());
			System.out.println("������ �����մϴ�.");
			
			dis.close();
			socket.close();
			System.out.println("������ ����Ǿ����ϴ�.");
		} catch(ConnectException ce) {
			ce.printStackTrace();
		} catch(IOException ie) {
			ie.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}