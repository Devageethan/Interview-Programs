package numberprogram;

import java.util.Arrays;

public class Decimaltobinary1 {
	public static void main(String[] args) {
		int a[] = new int[10];
		int n = 10;
		int i = 0;
		while (n > 0) {
			a[i] = n % 2;
			n /= 2;
			i++;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(a[j]);
		}

	}
}
