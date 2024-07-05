package ex05;

import java.util.Iterator;

public class ex08 {
	public static void main(String[] args) {
		/*
		 * i==0일때 행해라 i==1일때 행해라 ..
		 */
		int i = 0;
		
		for (; i < 5; i = i + 2) {
			System.out.println("I LOVE JAVA " + i);

		}
		
		
		System.out.println(i);
	}
}
