package practice1;

import java.util.Scanner;

import practice1.Bmi;
public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			while(true) { 
				System.out.println("[메뉴] 0.종료 1.계산기 2.BMI 3.윤년 4.성별 5.등수");
				String select = scanner.next();
				
					switch (select) {
						case "0" : System.out.println("종료..."); 
							break;
						case "1" : Calc aaa = new Calc();
									aaa.calc();
							break;
						case "2" :  Bmi aa = new Bmi(); 
									aa.bmi(); break;
						case "5" :  Ranking ranking = new Ranking();
								//	ranking.main();break;
						case "4" :   break;
					
					}//switch 	
				
				
			}//while 1 
		
	}// 에어리어  
} //필드 
