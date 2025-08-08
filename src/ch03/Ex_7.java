package ch03;

import java.util.Scanner;

public class Ex_7 {

	public static void main(String[] args) {
		// if , while

		// 선택>

		// 예금액> 10000
		// 출금액> 2000
		// 잔고> 8000

		// 선텍> 4
		// 프로그램 종료

		Scanner in = new Scanner(System.in);
		String msg = """
				--------------------------------
				1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
				--------------------------------
				선택>
				""";
		int money_a = 10000;
		int money_m;
		String menu = "";
		while (true) {
			System.out.println(msg);
			menu = in.nextLine();
			if (menu.equals("4")) {
				break;
			} else if (menu.equals("3")) {
				System.out.println("잔고>" + money_a);
			} else if (menu.equals("2")) {
				System.out.println("출금액>");
				String input = in.nextLine();
				// in.nextLine();
				money_m = Integer.parseInt(input);
				money_a = money_a - money_m;
			} else if (menu.equals("1")) {
				System.out.println("예금액>" + money_a);
			} else {
				System.out.println("메뉴 번호 다시 입력");
			}
		}
		System.out.println("프로그램 종료");

	}

}
