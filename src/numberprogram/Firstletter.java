package numberprogram;

public class Firstletter {
public static void main(String[] args) {
	String s1= "hgfbv ctdgcv tgdcv trdcv ";
	String[]arr=s1.split(" ");
	String res="";
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length(); j++) {
			char ch=arr[i].charAt(j);
			if(j==0&&ch>='a'&&ch<='z') {
				res+=(char)(ch-32);
			}else {
				res+=ch;
			}
		}
		res+=" ";
	}
	System.out.println(res);
}
}
