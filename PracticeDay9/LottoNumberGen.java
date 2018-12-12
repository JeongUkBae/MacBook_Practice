/**
 		// Lotto 6개의 램덤숫자.
		// 1 ~ 45 까지 랜덤 숫자. 
*/
package practiceDay9;

import java.util.Random;

public class LottoNumberGen {
	public void test() {
		Random random = new Random();
		int[] a = new int[6];
		String result = "";
		
		for(int i=0; i<a.length; i++) {
			int ran = random.nextInt(45);
				
			if(i<a.length) {
				result += ran+",";
			}else {
				result += ran+"";
			}
		}
		System.out.println(result);
		
	}//에어리어
	
	
	public static void main(String[] args) {
		LottoNumberGen a = new LottoNumberGen();
		a.test();
	}
	
	
}//필드 
