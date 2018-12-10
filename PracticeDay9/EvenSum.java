package PracticeDay9;

import java.util.Scanner;

public class EvenSum {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 x까지의 숫자중 짝수의 합을 알려드릴게요. ");
		int select = scanner.nextInt();
		String result = "";
		int ever = 0;
	    
		for(int i=0; i<select;i++) {
			if(i%2==0) {
				ever += i; 
				result += i+"+";
			}
		}
		System.out.println(ever);
		
	} //test area
	
	public static void main(String[] args) {
		EvenSum aa = new EvenSum();
		aa.test();
		
	} //main area
	
	
}//field
