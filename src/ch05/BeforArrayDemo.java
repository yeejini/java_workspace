package ch05;

public class BeforArrayDemo {

	public static void main(String[] args) {
		int score1 = 90;
		int score2 = 100;
		int score3 = 85;
		int score4 = 78;
		int score5 = 69;
		int score6 = 69;
		int score7 = 69;
		int score8 = 69;

		int sum = score1 + score2 + score3 + score4 + score5;

		System.out.println("학생 5명의 점수의 합은: " + sum);
		System.out.println("학생 5명의 점수의 평균은: " + sum / (double) 5);
	}

}
