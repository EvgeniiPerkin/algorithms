package com.perkin.dev.chapter1;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Chapter1 {

	public static void run() {
//		exercise_1_1_3();
//		exercise_1_1_5();
//		exercise_1_1_11();
//		exercise_1_1_13();
//		exercise_1_1_14();
//		exercise_1_1_16();
//		exercise_1_1_18();
		exercise_1_1_19();
	}
	
	public static void exercise_1_1_3() {
		StdOut.printf("Input number (1):");
		int t1 = StdIn.readInt();

		StdOut.printf("Input number (2):");
		int t2 = StdIn.readInt();

		StdOut.printf("Input number (3):");
		int t3 = StdIn.readInt();
		
		if (t1 == t2 && t1 == t3) {
			StdOut.println("the numbers are equal");
		} else {
			StdOut.println("the numbers are not equal");
		}
	}
	
	public static void exercise_1_1_5() {
		StdOut.printf("Input double:");
		double d1 = StdIn.readDouble();
		double min = 0.0;
		double max = 1.0;
		if (d1 >= min && d1 <= max) {
			StdOut.println(true);
		} else {
			StdOut.println(false);
		}
	}
	
	public static void exercise_1_1_11() {
		boolean[][] array = {{false, true, false},{true, false, true}};
		
		for (int i = 0; i < 2; i++ ) {
			for (int j = 0; j < 3; j++) {
				String p = " ";
				if (array[i][j])
					p = "*";
				StdOut.println("Col-" + i + ", Row-" + j + "=" + p);
			}
		}
	}
	
	public static void exercise_1_1_13() {
		int n = 2;
		int m = 4;
		int[][] a, b;
		a = new int[n][m];
		
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < m; ++j) {
				a[i][j] = i + j;
			}
		}
		System.out.println(Arrays.deepToString(a));

		b = new int[m][n];
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < m; ++j) {
				b[j][i] = a[i][j];
			}
		}
		System.out.println(Arrays.deepToString(b));
	}
	
	public static void exercise_1_1_14() {
		StdOut.println(lg(32)); // 5
		StdOut.println(lg(35)); // 5
		StdOut.println(lg(64)); // 6 
		StdOut.println(lg(70)); // 6
		StdOut.println(lg(128)); // 6
	}
	public static int lg(int num) {
		int n = 2;
		int j = 1;
		int result = 0;
		
		for(int i = 1; i < num; i++) {
			j = j * n;
			
			if (j > num) {
				break;
			}	
			result = i;		
		}
		
		return result;
	}	
	
	public static void exercise_1_1_16() {
		StdOut.println(exR1(6));
	}
	
	public static String exR1(int n) {
		if (n <= 0) return "";
		return exR1(n - 3) + n + exR1(n - 2) + n;
	}
	
	public static void exercise_1_1_18() {
		StdOut.println(mystery(2, 25));
		StdOut.println(mystery(3, 11));
	}
	
	public static int mystery(int a, int b) {
		if (b == 0) return 1;
		if (b % 2 == 0) return mystery(a * a, b / 2);
		return mystery(a * a, b / 2) + 2;
	}
	
	public static void exercise_1_1_19() {
		//StdOut.println(10 + " " + fibonacci(10));
		for (int N = 0; N < 100; N++) {
			StdOut.println(N + " " + fibonacci(N));
		}
	}
	
	public static int fibonacci(int N) {
		if (N == 0) return 0;
		if (N == 1) return 1;
		return fibonacci(N - 1) + fibonacci(N - 2);
	}
}

















