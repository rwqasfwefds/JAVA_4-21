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
			
//			byte 표현 범위 = -128 ~ +123
//			ip주소 표현범위 = 0 ~ 255 4자리 수로 되어있음
//			그러니깐 byte범위가 255까지 표현을 못 하니깐 넘어간거임(오버플로우가 일어남)
			byte[] ipAddr = ip.getAddress();
			System.out.println("getAddress() : " + Arrays.toString(ipAddr));
			
//			이게 byte배열에서 0 ~ 255까지의 ip주소를 표현하는 방법임
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
//			내 컴퓨터 정보
//			명령창에 ipconfig를 쓰면 확인 가능
//			192로 시작되는 ip는 다 사설 ip임(개인 ip)
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println();
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
//			웹서버가 각각 1개씩 총 2대라고 생각하면 됨
			ipArr = InetAddress.getAllByName("www.naver.com");
			
			for(int i = 0; i < ipArr.length; i++) {
				System.out.println("ipArr[" + i + "] : " + ipArr[i]);
			}
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
