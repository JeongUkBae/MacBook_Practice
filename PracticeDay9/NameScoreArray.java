package PracticeDay9;
import java.util.Scanner;

public class NameScoreArray {
		public void test() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("순위를 매기고자 하는 학생수 몇명인가요?");
			int x = scanner.nextInt();
			int[] y = new int[x];
			String result = "";
				
			System.out.println("각각 점수 입력");
			for(int i=0; i<y.length; i++) {
				y[i] += scanner.nextInt(); 
				if(i<y.length-1) {
					result += y[i]+",";
				} else {
					result += y[i];
				}
			}
			System.out.println(result);
			
			

		}//test area
		public static void main(String[] args) {
			NameScoreArray a = new NameScoreArray();
			a.test();
		}//main area

		
}//field

