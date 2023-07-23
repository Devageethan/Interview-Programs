package numberprogram;

import java.util.Scanner;

public class Strong {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int sum=0,fact=1,temp=num;
	while(num>0) {
		int last=num%10;
		fact=1;
		for(int i=1;i<=last;i++) {
			fact*=i;
		}
		sum+=fact;
		num/=10;
	}
	String res=temp==sum?"strong":"notstrong";
	System.out.println(res);
}
}
