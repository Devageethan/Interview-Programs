package numberprogram;

import java.util.Scanner;

public class Neon {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int sum=0,temp=num;
	num=num*num;
	while(num>0) {
		sum+=num%10;
		num/=10;
	}
	String res=sum==temp?"neon":"not neon";
	System.out.println(res);
}
}
