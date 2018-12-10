package PracticeDay9;
import java.util.Scanner;

public class NameScoreArray {
		public void test() {
			Scanner scanner = new Scanner(System.in);
		//length 수 받기 	
			System.out.println("순위를 매기고자 하는 학생수 몇명인가요?");
			int x = scanner.nextInt();
			int[] y = new int[x];
			String result = "";
			String result1 = "";
			String[] names = new String[x];

		//점수 받기 
			System.out.println("각각 이름과 점수 입력");
			for(int i=0; i<y.length; i++) {
				names[i] = scanner.next();
				y[i] += scanner.nextInt(); 
				if(i<y.length-1) {
					result1 += names[i]+",";
					result += y[i]+",";
				} else {
					result1 += names[i];
					result += y[i];
				}
			}
		// 이름 받기 
//			System.out.println("각각 이름 입력");
//			for(int i=0; i<y.length; i++) {
				
//			}			
			System.out.println(result); //점수 
			System.out.println(result1); //이름 
			
			for(int i=0; i<y.length; i++) {
			}
			
			

		}//test area
		public static void main(String[] args) {
			NameScoreArray a = new NameScoreArray();
			a.test();
		}//main area

		
}//field

