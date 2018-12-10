import java.util.Scanner;

public class Menu {

	public void main() {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while(true) {
		
		
		System.out.println("[메뉴] 0.종료 1.계산기 2.BMI 3.윤년 4.성별판독기 5.등수구하기 ");
		String select = scanner.next();
		
		
		
		
				switch (select) {
					case "0" :  
								System.out.println("종료 ");
						return;	
							
					case "1" : 
								System.out.println("[계산기] x + y 를 입력하세요  ");
								int a = scanner.nextInt();
								String op = scanner.next();
								int b = scanner.nextInt();
								int result = 0;
						
						
								switch(op) {
									case "+" : result = a + b; break;
									case "-" : result = a - b; break;
									case "*" : result = a * b; break;
									case "/" : result = a / b; break;
									case "%" : result = a % b; break;
									default : System.out.println("다시 입력하세요."); break;
									}
									System.out.println(a+op+b+"="+result);
						break;
						
					case "2" : 
							   System.out.println("[BMI] 체중과 키입력하세요.  ");			
							   double wi = scanner.nextDouble();
							   double hi = scanner.nextDouble();
							   double bmi = (wi/((hi*hi)/10000));
							   String result2 = "";
							   
							   if(bmi>=40) {
								   result2 = "고도비만 ";
							   }else if(bmi>=35) {
								   result2 = "중등도비만 ";
							   }else if(bmi>=30) {
								   result2 = "경도비만 ";
							   }else if(bmi>=25) {
								   result2 = "과체중 ";
							   }else if(bmi>=18.5) {
								   result2 = "정상 ";
							   }else {
								   result2 = "저체중 ";
							   }
						
							   System.out.println("BMI : "+bmi);
							   System.out.println(result2);
						break;
						
					case "3" : 
							  System.out.println("[윤년]년도를 입력하세요.");
							  int year = scanner.nextInt();
							  String result3 = "";
									  
							  if(year%4==0  && year%400==0 || year%100!=0) {
								  result3 = "윤년 ";
							  } else {
								  result3 = "평년 ";
							  }
							  
							 System.out.println(result3);
						break;	
						
					case "4" : 
							  System.out.println("[성별판독] 이름과 주민번호를 입력하세요.");
							  String name = scanner.next();
							  String ssn = scanner.next();
							  char ch = ssn.charAt(7);
							  String result4 = "";
							  
							  switch (ch) {
							  		case '1' :  result4 = "남자 "; break;
							  		case '2' :  result4 = "여자 "; break;
							  		case '3' :  result4 = "남자 "; break;
							  		case '4' :  result4 = "여자 "; break;
							  		case '5' :  result4 = "외국인 "; break;
							  		case '6' :  result4 = "외국인 "; break;
							  		
							  		default: result4 = "다시입력하세요.";
							  				break;
							  		}
							  System.out.println(result4);
					
					
					
						} //1 스위치 
		
			} //에이리어 메인 웰
	}//메인 에어리어 
}//메인 필드 