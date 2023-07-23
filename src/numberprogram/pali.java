package numberprogram;

public class pali {
	public static void main(String[] args) {
		int i=1213;
		int rev=0,temp=i;
		while(i>=0) {
			rev=rev*10+(i%10);
		}
		i++;
		System.out.println(rev);
	}
	 

}
