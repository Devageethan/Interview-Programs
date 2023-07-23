package numberprogram;

public class p1 {
				public static void main(String[] args) {
					int s=7;
					
					int sum=0;
					for(int i=1;i<s;i++) {
						if(s%i==0)
							sum+=i;
					}
					if(sum==s)
						System.out.println("perfect");
					else 
						System.out.println("not perfect");
				}
}
