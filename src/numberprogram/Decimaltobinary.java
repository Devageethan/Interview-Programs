package numberprogram;

public class Decimaltobinary {
public static void main(String[] args) {
	int n=7;
	int rem;
	String binary="";
	while(n>0) {
		rem=n%2;
		n=n/2;
		binary=rem+binary;
	}
	System.out.println(binary);
}
}
