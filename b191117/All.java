import dept.*;

class All{
public static void main(String args[]){
	CSE csedept = new CSE();
	ECE ecedept = new ECE();
	ME medept = new ME();
	CE cedept = new CE();
	System.out.println("Department wise subjects are: ");
	csedept.display();
	ecedept.display();
	medept.display();
	cedept.display();
}
}
