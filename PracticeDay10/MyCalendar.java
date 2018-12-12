package practiceDay10;

import java.util.Scanner;

public class MyCalendar {
	public void mycalendar() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("[윤년] 원하는 년도를 입력하세요.\n");
		int year = scanner.nextInt();
		String result = "";
		
		if(year % 4 == 0 && year %400 == 0 || year % 100 != 0) {
			result = "윤년";
		} else {
			result  = "평년";
		}
		
		System.out.printf("%d 년은 '%s' 입니다.",year,result);
		
	}
public static void main(String[] args) {
	MyCalendar a = new MyCalendar();
	a.mycalendar();
}
}
