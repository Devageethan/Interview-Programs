package numberprogram;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
String name;
int rollno;
Arraylist(String s,int r){
	name=s;
	rollno=r;
}
public String toString() {
	return "name:["+name+"]"+" rollno:"+rollno;
}
public static void main(String[] args) {
	List al=new ArrayList<>();
	al.add(new Arraylist("deva",13));
	al.add(new Arraylist("naveen",22));
	System.out.println(al);
}
}
