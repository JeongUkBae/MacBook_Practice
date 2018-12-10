package Practice;

import java.util.Scanner;

public class Year {
	public void year() {
		Scanner scanner = new Scanner(System.in);
		System.out.println( "년도 입력하세요.");
		int year = scanner.nextInt();
		String result3 = "";
		
		if(year%4==0 && year%400==0) {
			result3 = "윤년";
		} else if (year%100==0) {
			result3 = "평년";
		}
			
		System.out.println(year);
	
	} // 에어리어 
} //필드 
