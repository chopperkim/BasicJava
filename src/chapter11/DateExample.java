package chapter11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		// 날짜를 2024-04-05 수요일
		// 날짜 형식을 지정해서 사용
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		System.out.println(dateFormat.format(date));
		// 날짜를 Singleton 형식으로 제공
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int date2 = calendar.get(Calendar.DAY_OF_MONTH);
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.printf("%4d-%02d-%02d %d\n", year, month, date2, day);
		// JDK 1.8부터 사용 가능
		System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일")));
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 hh시 mm분")));
	}
}






