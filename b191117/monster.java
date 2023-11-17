import java.util.*;
class Main2{
	public static void main(String[] args){
		fire m1=new fire();
		water m2=new water();
		stone m3=new stone();
		m1.attack();
		m2.attack();
		m3.attack();
	}
}
class monster{
public void attack(){
System.out.println("The monster attacks!");
}
}
	class fire extends monster{
	public void attack(){
	System.out.println("Monster attacks with fire");
	}
	}
	class water extends monster{
	public void attack(){
	System.out.println("Monster attacks with water");
	}
	}
	class stone extends monster{
	public void attack(){
	System.out.println("Monster attack with stone");
	}
	}
