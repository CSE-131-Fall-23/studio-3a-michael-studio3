package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("What is the number?");
		int n = number.nextInt();
		int[] sieve = new int [n];
		
		for (int i = 2; i < n; i++) {
			System.out.println(i);
			int j = i;
			while (j < n) {
				sieve [j] = (i * j);
				j = (j + i);
				System.out.println(j);
				}
			
			}
		
	}

}