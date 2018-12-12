package practiceDay10;

import java.util.Scanner;

public class Calc {
	public void calc() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("[계산기] x + op + y의 값을 넣어주세요.\n");
		
		int x = scanner.nextInt();
		String op = scanner.next();
		int y = scanner.nextInt();
		int result = 0;
		
		switch(op) {
			case "+" : result = x + y ; break;
			case "-" : result = x - y ; break;
			case "*" : result = x * y ; break;
			case "/" : result = x / y ; break;
			case "%" : result = x % y ; break;
			default : result = 0; break;
		}
		System.out.printf("\n%d %s %d = %d",x,op,y,result);
		
	}
public static void main(String[] args) {
	Calc test = new Calc();
	test.calc();
}
}
