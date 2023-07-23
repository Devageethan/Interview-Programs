package numberprogram;

public class RemoveSpecialchar {
public static void main(String[] args) {
	String s="devageethan1310@%$#";
	s=s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s);
}
}
