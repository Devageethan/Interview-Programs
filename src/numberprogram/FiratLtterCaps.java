package numberprogram;

import java.util.Iterator;

public class FiratLtterCaps {
public static void main(String[] args) {
	String s1="how are you";
	for (int i = 0; i < s1.length(); i++) {
		if (s1.charAt(i)==32) {
			char ch=Character.toUpperCase(s1.charAt(i+1));
			System.out.print(" "+ch);
		}else {
			System.out.print(s1.charAt(i));
		}
		
	}
}
}
