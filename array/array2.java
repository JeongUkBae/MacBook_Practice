package array;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.ScrollPaneUI;

public class array2 {
	public static void main(String[] args) {
		
		String[] un = {"캡틴","윈터솔져","팔콘","스칼렛위치","앤트맨" }; 
		String[] notun = {"아이언맨", "블랙위도우", "워머신","비전","블랙팬서"};
		String[] gaogal = {"스타로드","가모라","드랙스","로켓","그루트"};
		String[] outside = {"토르", "스파이더맨","헐크","호크아이","-"};

		String[][] marvel = {un,notun,gaogal,outside};
		
		Random random = new Random();
		int[][] scores = new int[4][5];
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				scores[i][j] = random.nextInt(40)+60;
				System.out.print(marvel[i][j]+"\t");
				System.out.print(scores[i][j]+" \t");
			}
			System.out.println("\t");
		}
		
		System.out.printf("팀명을 입력하세요. \n"
				+ "[UN소속] un \t [UN비소속] notun \t [갤럭시오브가디언즈] gaogal \t [외행성히어로's] outside \n");
		Scanner scanner = new Scanner(System.in);
		String teams = scanner.next();
		System.out.println(teams);
		String res = "";

		int[] rank = new int[5];
		for(int i=0; i<rank.length; i++) {
			System.out.println("등수: "+rank[i]+"등  이름: "+marvel[0][i]+", 점수: "+scores[0][i]);
			
		}
		int temp = 0;
		for(int i=0; i<5; i++) {
			temp = scores[i][0];
			for(int j=0; j<5; j++) {
				if(temp < scores[0][j]) {
					temp = scores[0][j+1];
					scores[0][j] = scores[0][j+1];
					rank[i] = i+1;
				}
				System.out.println(rank[i]+""+scores[i][j]);
			}
		}
		
		
		
		
	/*	
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
			System.out.print(scores[i][j]+"\t");
		}
			System.out.println("\n");
		}
	*/	
		
		
		
		
	}
}
