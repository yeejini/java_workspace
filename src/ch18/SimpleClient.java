package ch18;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("172.30.1.47", 5000);
			OutputStream os = client.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject("안녕, 단순 서버야!");
			// 버펄 비워서 내보내줌
			oos.flush();
			System.out.println("메시지 전송 완료");
//			Thread.sleep(500);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
