package array;

import java.util.ArrayList;
import java.util.Iterator;

public class arraytest2 {
	public static void main(String[] args) {

		int sizeX = 5;
		int sizeY = 10;

		int[][] ary = new int[sizeX][sizeY];
		for(int i = 0; i <sizeX; ++i) {
		 for(int j=0; j<sizeY; j++) {
			System.out.println(ary[i][j]+"\t");
			
		 }
		 System.out.println("\t");
		}
	}

		
	}

