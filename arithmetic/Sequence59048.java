package arithmetic;
/**
 * 등비수열 : 각 항이 그 앞 항과. 일정한 비를 가지는 수열
 *	공비(共比, common ratio)
 * 2 + 6 + 18 + 54 = 80 4항까지의 합이다.
 * 그렇다면 10항까지의 합(=시리즈)은 얼마인가? 59048
 * 2 + (2 * 3) + (2 * 3 * 3) + (2 * 3 *  * 3 * 3)
 */

public class Sequence59048 {
	public static void main(String[] args) {
		int A = 2; // 초항 init
 		int R = 3; // 공비 common rate
		int S = A; // series
		int N = 2; // count(iterator)
		while(true) {
			System.out.printf("Number %d / A: %d / S: %d\n",N,A,S);
			A = A*R;
			S = S+A; 
			N++;
			if(N>5) {
				break;
			}
			
		}
		System.out.printf("S is %s ", S);
	}
}