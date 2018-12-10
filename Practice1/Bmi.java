package Practice1;

import java.util.Scanner;

public class Bmi {
	public void bmi() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("체중과 키 입력 하세요. ");
		Double wi = scanner.nextDouble();
		Double hi = scanner.nextDouble();
		Double bmi = (wi/((hi*hi)/10000));
		String result2 = "";
		
		if(bmi>=40) {
			result2 = "고도비만";
		} else if(bmi>=35) {
			result2 = "중등도비만";
		} else if(bmi>=30) {
			result2 = "경도비만";
		} else if(bmi>=25)	{
			result2 = "과체중";
		} else if(bmi>=18.5) {
			result2 = "정상";
		} else {
			result2 = "저체중";
		}
		System.out.println("BMI : " +bmi);
		System.out.println(result2);
		
	}
}
