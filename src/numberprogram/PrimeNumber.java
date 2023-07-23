package numberprogram;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the num");
	int start=s.nextInt();
	int end =s.nextInt();
	int count=0;
	for(int i=start;i<=end;i++) {
		count=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
	if(count==2) {
		System.out.println(i+"is prime");
	}else {
		System.out.println(i+"is not prime");
	}
	}
}
}
