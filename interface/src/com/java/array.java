package com.java;

public class array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		// for(int i=0;i<5;i++)
		// {
		// System.out.println(a[i]);
		// }
		int b[] = { 6, 7, 8, 9, 10 };
		// for(int i=0;i<5;i++)
		// {
		// System.out.println(b[i]);
		//
		// }
		int c[] = new int[a.length + b.length];
		
		int z = 0;
		for (int i = 0; i < a.length; i++) {
			c[z]=a[i];
			System.out.println(c[z]);
			z++;
		}
		for (int i = 0; i < b.length; i++) {
			c[z]=b[i];
			System.out.println(c[z]);
			z++;
		}

	}
}
