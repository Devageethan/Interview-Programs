package numberprogram;

public class Hexadecimal {
public static void main(String[] args) {
	int n=15;
	int i=0;
	int []h=new int [100];
	while(n!=0) {
		h[i]=n%16;
		n/=16;
		i++;
	}
	for(int j=i-1;j>=0;j--) {
	if(h[j]>9) {
	System.out.print((char)+(55+h[j]));
	}else {
		System.out.print(h[j]);
	}
	}
}
}
