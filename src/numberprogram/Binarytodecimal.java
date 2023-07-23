package numberprogram;

public class Binarytodecimal {
public static void main(String[] args) {
	int d=0;
	int last=0;
	int binary=1010;
	int base=1;
	int temp=binary;
	while(temp>0) {
		last=temp%10;
		temp/=10;
		d=d+last*base;
		base=base*2;
	}
	System.out.println(d);
}
}
