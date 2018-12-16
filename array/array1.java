package array;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class array1 {
	public static void main(String[] args) {
		
		
		int[] data = {7, 5, 6, 1, 9};
		int temp = 0;
		
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data.length; j++) {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
			System.out.println(data[i]+"");
		}
		
	}
}
