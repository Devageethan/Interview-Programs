package numberprogram;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int temp=num;
	int sum=0,product=1,count=0;
	while(num>0) {
		num/=10;
		count++;
	}
	num=temp;
	while(num>0) {
		int last=num%10;
		for(int i=1;i<=count;i++) {
			product*=last;
		}
		sum+=product;
		num/=10;
		product=1;
	}
	String res=temp==sum?"armstrong":"not armstrong";
	System.out.println(res);
}
}
