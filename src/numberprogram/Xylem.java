package numberprogram;

import java.util.Scanner;

public class Xylem {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int last=num%10;
	int ms=0;
	num/=10;
	while(num>9) {
		ms=ms+num%10;
		num/=10;
	}
	int total=num+last;
	String res=total==ms?"xylem":"not xylem";
	System.out.println(res);
}
}
