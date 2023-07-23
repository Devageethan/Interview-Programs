package numberprogram;

import java.util.StringTokenizer;

public class Countnoofwords {
public static void main(String[] args) {
	StringTokenizer s=new StringTokenizer("hi how are you");
	System.out.println(s.countTokens());
	while(s.hasMoreTokens()) {
		System.out.print(s.nextToken());
	}
}
}
