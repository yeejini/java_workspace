package ch08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		Date d = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(sdf.format(d));
	}

}
