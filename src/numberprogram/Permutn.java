package numberprogram;

public class Permutn {
public static void main(String[] args) {
	String str="abc";
	String p="";
	printpermutn(str,p);
	
}
 static void printpermutn(String str, String p) {
if(str.length()==0) {
	System.out.print(p+" ");
	return;
}
for(int i=0;i<str.length();i++) {
	char ch=str.charAt(i);
	String res=str.substring(0, i)+str.substring(i+1);
	printpermutn(res,p+ch);
}
}
}
