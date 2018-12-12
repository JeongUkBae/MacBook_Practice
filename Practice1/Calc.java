package practice1;

import java.util.Scanner;

public class Calc {
	public void calc() {
		System.out.println("Calc");
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		String op = scanner.next();
		int y = scanner.nextInt();
		int result1 = 0;
		
			switch (op) {
			case "+":  result1 = x + y;	break;
			case "-":  result1 = x - y;	break;
			case "*":  result1 = x * y;	break;
			case "/":  result1 = x / y;	break;
			case "%":  result1 = x % y;	break;

			default: result1 = 0;
				break;
			}
		System.out.println(x+op+y+"="+result1);
		
	} //메서드 
} // 필드 
