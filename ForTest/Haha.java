package forTest;

import java.util.Scanner;

public class Haha {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("1~10까지의 합을 구하시오.");
	String fortest = "";
	int result = 0;
	
	for(int i = 1; i<=10; i++) {
			if(i!=10) {
				fortest += i + "+";
			} else {
				fortest += i + "=";
			}
			result += i;
			
			
			
		}//~for 
	System.out.print(fortest+result);	
	
			
	}//~에어리어 
}//~필드 
