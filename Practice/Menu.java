package Practice;

import java.util.Scanner;

public class Menu {
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		
			while (true) {
				System.out.println("메뉴 0.종료 1.계산기 2.BMI 3.윤년 4.주민번호 5.등수");
				String select = scanner.next();	
					
				switch (select) {
						case "0" : 
								  System.out.println("종료...");
								  break;
						case "1" : 
								  Calc calc1 = new Calc();
								  calc1.calc();
								  break;
						case "2" : 
								  Bmi bmi1 = new Bmi();
								  bmi1.bmi();
								  break;
						case "3" :
								  Year year1 = new Year();
								  year1.year();
								  break;
						case "4" :
								
								  break;
						case "5" : break;
							
						default:	
							break;
					}//스위치1
			
			
			
		}//와일 1
		
		
	}//메인 에어리어 
}//메인 필
	

