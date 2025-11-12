package ch18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Echo2Server extends Thread {
	// 변수
	protected static boolean cont = true;
	protected Socket connection = null;

	// 생성자
	private Echo2Server(Socket clientSocket) {
		connection = clientSocket;
		System.out.println("서버 열렸나요?");
		System.out.println(connection.getInetAddress().getHostAddress());
		start(); // run 돌아감

	}

	public static void main(String[] args) {
		ServerSocket server = null;

		try {
			server = new ServerSocket(7500);
			System.out.println("서버 주소 : " + server.getInetAddress().getHostAddress());

			while (cont) {
				System.out.println("서버가 7500번 포트에서 대기중");

				new Echo2Server(server.accept());
			}

			server.close();

		} catch (Exception e) {
			System.out.println("소켓 연결 및 메시지 수신 중 오류 발생");
			System.out.println(e.getMessage());
		}
	}

	// 하나의 클라이언트 스레드를 처리하는 서버
	// run() ==> 스레드 (한 클라이언트에 하나씩 생성되는 서버)가 실행되는 코드
	@Override
	public void run() {
		BufferedReader in = null;

		System.out.println("클라이언트와 통신을 위한 새로운 스레드 생성...");

		try {
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			String message = "";

			while ((message = in.readLine()) != null) {
				if (message.contains("끝")) {
					in.close();
					connection.close();
					break;

				}
				System.out.println("읽은 메시지:" + message);
			}
		} catch (Exception e) {
		}

	}

}
