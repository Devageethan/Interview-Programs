package numberprogram;

public class RemoveSpace {
public static void main(String[] args) {
	String s="    hi    good                   morning";
	s=s.replaceAll("\\s", "");
	System.out.println(s);
}
}
