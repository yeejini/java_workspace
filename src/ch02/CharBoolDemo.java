package ch02;

public class CharBoolDemo {

	public static void main(String[] args) {
		char gal = '가';

		int a = 10;
//		boolean cham = true;
		boolean cham = (a == 10);
//		boolean geojit = false;
		boolean geojit = (a != 10);

		System.out.println(gal);
		System.out.println(cham);
		System.out.println(geojit);
	}

}
