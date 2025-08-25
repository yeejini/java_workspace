package ch10.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// 요구사항: 1. 계좌 생성할 때 반드시 초기 입금액을 0보다 크게 입력해야 한다.
//					   비밀번호는 숫자 4자리
		// 2. 예금은 금액 제한 없다.
		// 3. 출금은 잔고보다 큰 금액은 인출할 수 없다.
		// 4. 예금주의 이름이나 계좌번호는 계좌생성 후 변경할 수 없다.
		// 5. 입금 시 계좌번호만 알면 입금할 수 없다.
		// 6. 출금 시에는 계좌번호와 비밀번호가 일치해야한 인출할 수 없다.
		// 7. 비민번호 변경 가능
		String msg = """
				-----------------------------------------------
				  1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
				-----------------------------------------------
				선택>
				""";

		Scanner in = new Scanner(System.in);

		ArrayList<Account> account = new ArrayList<>();
		ArrayList<Account> accounts = new ArrayList<>();

		String accountNo;
		String accountOwner;
		Long balance;
		String password;

		// 전역변수로 설정
		String menu = "";
		while (true) {
			System.out.println(msg);
			menu = in.nextLine();
			if (menu.equals("5")) {
				System.out.println("안녕히 가세요.");
				break;
			}
			switch (menu) {
			case "1" -> {
				createAccount(in, accounts);
				break;
			}

			case "2" -> {
				listAccounts(accounts);
				break;
			}

			case "3" -> {
				depositAccounts(in, accounts);
				break;
			}

			case "4" -> {
				withrawAccount(in, accounts);
				break;
			}

			default -> System.out.println("메뉴 번호 다시 확인하세요.");
			}
		}
	}

	private static void createAccount(Scanner in, ArrayList<Account> accounts) {
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.println("계좌번호:");
		String accountNo = in.nextLine();

		System.out.println("계좌주:");
		String accountOwner = in.nextLine();

		System.out.println("초기입금액: (0보다 큰 값을 입력하세요)");
		String b = in.nextLine();
		Long balance = Long.parseLong(b);
		if (balance <= 0) {
			System.out.println("입금액은 0보다 커야 합니다.");
			return;

		}
		// nextLong() 로 숫자를 읽은 후, nextLine()을 입력해서 엔터를 처리

		System.out.println("비밀번호: (비밀번호는 4자리를 입력해야 합니다.)");
		String password = in.nextLine();
		if (password.length() < 4 || password.length() > 4) {
			System.out.println("비밀번호는 4자리를 입력해야 합니다.");
			return;
		}

		System.out.println("결과: 계좌가 생성되었습니다.");

		accounts.add(new Account(accountNo, accountOwner, balance, password));
		return;

	}

	private static void listAccounts(ArrayList<Account> accounts) {
		System.out.println("계좌목록");
		System.out.println("------");
		for (Account a : accounts) {
			System.out.println(a.getAccountNo());
			System.out.println(a.getAccountOwner());
			System.out.println(a.getBalance());

		}
		return;
	}

	private static void depositAccounts(Scanner in, ArrayList<Account> accounts) {
		Long y;
		System.out.println("예금");
		System.out.println("------");
		System.out.println("계좌번호:");
		String accountNo = in.nextLine();
		System.out.println(accountNo);

		boolean found = false;
		for (Account a : accounts) {
			if (a.getAccountNo().equals(accountNo)) {
				System.out.println("예금액:");
				y = in.nextLong();
				in.nextLine();
				System.out.println("예금이 완료되었습니다.");
				found = true;
				return;

			}
		}

		if (!found) {
			System.out.println("일치하는 계좌번호가 없습니다.");
		}
		return;
	}

	private static void withrawAccount(Scanner in, ArrayList<Account> accounts) {
		Long money;
		System.out.println("출금");
		System.out.println("------");
		System.out.println("계좌번호:");

		String accountNo = in.nextLine();
		boolean foundaccount = false;
		boolean foundpassword = false;

		for (Account a : accounts) {
			if (a.getAccountNo().equals(accountNo)) {
				System.out.println("비밀번호:");
				String password = in.nextLine();

				if (a.getPassword().equals(password)) {
					System.out.println("출금액:");
					money = in.nextLong();
					in.nextLine();

					if (money > a.getBalance()) {
						System.out.println("출금액이 잔고보다 많습니다.");
						return;
					}
					Long balance = a.getBalance();
					balance = balance - money;

					// 매개변수값 변경 시 setter사용
					a.setBalance(balance);

					System.out.println("결과: 출금이 성공되었습니다.");
					foundpassword = true;
					return;
				}
				if (!foundpassword) {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}

				foundaccount = true;
				return;

			}

		}

		if (!foundaccount) {
			System.out.println("일치하는 계좌가 없습니다.");
		}
		return;
	}

}
