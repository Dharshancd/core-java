package com.dharshan.array;

public class ArrayPattern {
	public static void main(String[] args) {
		ArrayPattern p = new ArrayPattern();
		p.printPattern(6, 10);
	}

	private void printPattern(int x, int y) {

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (j >= i && j<=y-i-1 ) {
					System.out.print(' ');
					System.out.print('*');
				} else {
					System.out.print("  ");
						
				}
			}

			System.out.println();
		}
	}
}