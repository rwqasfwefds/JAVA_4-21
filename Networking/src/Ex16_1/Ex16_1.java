package Ex16_1;

import java.net.*;
import java.util.*;

public class Ex16_1 {

	public static void main(String[] args) {
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println("toString() : " + ip.toString());
			
//			byte ǥ�� ���� = -128 ~ +123
//			ip�ּ� ǥ������ = 0 ~ 255 4�ڸ� ���� �Ǿ�����
//			�׷��ϱ� byte������ 255���� ǥ���� �� �ϴϱ� �Ѿ����(�����÷ο찡 �Ͼ)
			byte[] ipAddr = ip.getAddress();
			System.out.println("getAddress() : " + Arrays.toString(ipAddr));
			
//			�̰� byte�迭���� 0 ~ 255������ ip�ּҸ� ǥ���ϴ� �����
			String result = "";
			for(int i = 0; i < ipAddr.length; i++) {
				result += (ipAddr[i] < 0 ? ipAddr[i] + 256 : ipAddr[i]) + ".";
			}
			System.out.println("getAddress() + 256 : " + result);
			System.out.println();
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
//			�� ��ǻ�� ����
//			����â�� ipconfig�� ���� Ȯ�� ����
//			192�� ���۵Ǵ� ip�� �� �缳 ip��(���� ip)
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println();
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
//			�������� ���� 1���� �� 2���� �����ϸ� ��
			ipArr = InetAddress.getAllByName("www.naver.com");
			
			for(int i = 0; i < ipArr.length; i++) {
				System.out.println("ipArr[" + i + "] : " + ipArr[i]);
			}
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}