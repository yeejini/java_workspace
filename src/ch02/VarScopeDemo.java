package ch02;

public class VarScopeDemo {

	public static void main(String[] args) {
		int var1 = 10; // 전역변수
		System.out.println(var1);

		if (true) {
			int var2 = 20;
			System.out.println("if --> " + var1);
			System.out.println("if --> " + var2);
		}

		for (int i = 0; i < 2; i++) {
			int var3 = 30;
			System.out.println("for --> " + var1);
//			System.out.println("for --> " + var2); //var2 사용 못
			System.out.println("for --> " + var3);

		}
		System.out.println("main --> " + var1);
		// var2, var3 사용 못함
	}

}
