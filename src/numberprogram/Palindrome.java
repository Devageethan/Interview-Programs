package numberprogram;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int rev=0;
	int temp=num;
	while(num>0) {
		rev=rev*10+num%10;
		num/=10;
	}
	String res=temp==rev?"palindrome":"not palindrome";
	System.out.println(res);
}
}
