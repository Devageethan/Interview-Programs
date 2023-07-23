package numberprogram;

import java.util.Arrays;
import java.util.Iterator;

public class Anagram {
                       public static void main(String[] args) {
                    	   			String s1="aRmy";
                    	   			String s2="MaRy";
                    	   			s1=s1.toLowerCase();
                    	   			s2=s2.toLowerCase();
                    	   			int count=0;
                    	   	char [] ch1=s1.toCharArray();
                    	   	char [] ch2=s2.toCharArray();
                    	   	Arrays.sort(ch1);
                    	   	Arrays.sort(ch2);
                    	   
                    	   for (int i=0;i<ch1.length;i++) {
                    		   if (ch1.length==ch2.length) {
                    			   if (ch1[i]==ch2[i]) {
											count++;
											}
							}
                    		  
                    	   }
                    	   if(	count==ch1.length)
                			   System.out.println("anagram");
                		   else
                			   System.out.println("not anagram");
								
							}
                    	   	
//                    	   	
					}

