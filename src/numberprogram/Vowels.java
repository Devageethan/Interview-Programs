package numberprogram;

import java.util.Scanner;

public class Vowels {
static void isVowel(char ch) {
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
		System.out.println("character is vowels");
	}else {
		System.out.println("character is consonents");
	}
}
public static void main(String[] args) {
	isVowel('U');
}
	

}
