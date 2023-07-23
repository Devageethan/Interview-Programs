package numberprogram;

public class Permutation1 {
static void printPermutn(String str,String a) {
	if(str.length()==0) {
		System.out.print(a+" ");
	}
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		String r=str.substring(0,i)+str.substring(i+1);
		printPermutn(r,a+ch);
	}
}
public static void main(String[] args) {
	String str="acb";
	String a="";
	printPermutn(str,a);
}
}
