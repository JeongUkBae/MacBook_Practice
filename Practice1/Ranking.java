package practice1;

import java.util.Scanner;

public class Ranking {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생이름과 점수 입력");
		String name = scanner.next();
		int ro = scanner.nextInt();
		String name1 = scanner.next();
		int ro1 = scanner.nextInt();
		String name2 = scanner.next();
		int ro2 = scanner.nextInt();
		
		String[] a = new String[3];
		a[0] = name;
		a[1] = name1;
		a[2] = name2;
		
		int[] i = new int[3];
		i[0] = ro;
		i[1] = ro1;
		i[2] = ro2;
		
		String result = "";
		for(i[3]=1; i[3]<=3; i[3]++) {
			if(i[0]>i[1]&&i[1]>i[2]) {
				System.out.println(i[0]+"+"+i[1]+"+"+i[2]);
			
			}
			
		}
		
		
		System.out.println(a[0]+a[1]+a[2]);
		
	}
	
}
