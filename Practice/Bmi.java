package practice;

import java.util.Scanner;

public class Bmi {
	public void bmi() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("BMI 몸무게와 키 입력 ");
		Double wi = scanner.nextDouble();
		Double hi = scanner.nextDouble();
		Double bmiresult = (wi/((hi*hi)/10000));
		String result2 = "";
		
		if(bmiresult>=40) {
			result2 = "고도비만";
		} else if(bmiresult>=35) {
			result2 = "중등도비만"; 
		} else if(bmiresult>=30) {
			result2 = "경도비만";
		} else if(bmiresult>=25) {
			result2 = "과체중";
		} else if(bmiresult>=18.5){
			result2 = "정상";
		} else {
			result2 = "저체중";
		}
		System.out.println(result2);
		
		
		
	} //에어리어 
	
}//필드 
