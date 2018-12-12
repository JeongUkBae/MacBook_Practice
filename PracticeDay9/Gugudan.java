package practiceDay9;

import java.util.Scanner;

public class Gugudan {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("구구단을 외자~");
		int x = scanner.nextInt();
		String result = "";
		
		for(int i=1; i<10; i++) {
			result += x+"x"+i+"="+x*i+"\n";
		}
		System.out.println(result);
		
		
	}//test area
	
	public static void main(String[] args) {
		Gugudan aa = new Gugudan();
		aa.test();
	}//main area
}//field
