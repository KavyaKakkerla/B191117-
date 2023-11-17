import java.util.*;
class Demo{
public static void main(String args[]){
HashMap<String,Integer> map = new HashMap<>();
	map.put("Sravanth",9);
	map.put("Kavya",10);
	map.put("Venkatesh",11);
	map.remove("Sravanth");
	System.out.println(map.get("Kavya"));
	System.out.println(map.containsKey("Sravanth"));
	System.out.println(map.size());
	System.out.println(map);
}
}
