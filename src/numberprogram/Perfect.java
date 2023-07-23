package numberprogram;

import java.util.Scanner;

public class Perfect {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the num");
	int num=s.nextInt();
	int res=0;
	for(int i=1;i<num;i++) {
		if(num%i==0) {
			res+=i;
		}
	}
	String r=(num==res)?"perfect":"not perfect";
	System.out.println(r);
}
}
