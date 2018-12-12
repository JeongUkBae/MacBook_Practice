package practiceDay10;

import java.util.Scanner;

public class Bmi {
	public void bmi() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("[BMI] 몸무게와 키를 순서대로 입력하세요\n");
		Double wi = scanner.nextDouble();
		Double hi = scanner.nextDouble();
		Double bmi = (wi/((hi*hi)/10000));
		String result = "";
		
		if(bmi>=40) {
			result = "고도비만";
		} else if(bmi>=35) {
			result = "중등비만";
		} else if(bmi>=30) {
			result = "비만";
		} else if(bmi>=25) {
			result = "과체중"; 
		} else if(bmi>=18.5) {
			result = "정상";
		} else {
			result = "저체중";
		}
		
		
		System.out.printf("%f \n%s ",bmi,result);
		
		
	}
public static void main(String[] args) {
	Bmi a = new Bmi();
	a.bmi();
}
	
}
