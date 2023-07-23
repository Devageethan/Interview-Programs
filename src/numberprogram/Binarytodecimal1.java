package numberprogram;

public class Binarytodecimal1 {
public static void main(String[] args) {
	int i=0,d=0;
	int b=10001;
	while(b>0) {
		int rem=b%10;
		b/=10;
		d=(int) (d+(rem*Math.pow(2, i)));
		i++;
	}
	System.out.println(d);
}
}
