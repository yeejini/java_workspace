package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			ServerSocket server = new ServerSocket(5000);
			System.out.println("5000번 포트에 서버가 대기중...");
			Socket connection = server.accept();
			InputStream is = connection.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			String message = (String) ois.readObject();
			System.out.println("받은 문자열 :" + message);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}