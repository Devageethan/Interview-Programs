package numberprogram;

import java.util.HashMap;

public class Hashmap {
String name;
Hashmap(String s){
	name=s;
	}
public String toString() {
	return "name:"+name;
}

public static  void main(String[] args) {
	HashMap h=new HashMap<>();
	Hashmap i=new Hashmap("levi");
	h.put(1, i);
	System.out.println(h);
}
}
