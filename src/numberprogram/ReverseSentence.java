package numberprogram;

public class ReverseSentence {
public static void main(String[] args) {
	String s="hello everyone!";
	String res="";
	String[]rev=s.split(" ");
	for(int i=rev.length-1;i>=0;i--) {
		System.out.print(rev[i]+"");
	}
	
}
}
