abstract class Employee{
	abstract double getAmount();
}
class Weeklyemployee extends Employee{
	private int noofweeks;
	private double totalamount;

public Weeklyemployee(int noofweeks , double totalamount){
	this.noofweeks = noofweeks;
	this.totalamount = totalamount;
}
double getAmount(){
return totalamount/noofweeks;
}
}
class Hourlyemployee extends Employee{
	private int noofhours;
	private double hourlyrate;
	
public Hourlyemployee(int noofhours , double hourlyrate){
	this.noofhours=noofhours;
	this.hourlyrate=hourlyrate;
}
double getAmount(){
return noofhours * hourlyrate;
}
}
public class Emp{
public static void main(String args[]){
	Weeklyemployee weeklyemployee = new Weeklyemployee(5,40000);
	Hourlyemployee hourlyemployee = new Hourlyemployee(6,200);
	
	System.out.println("For weekly employee salary per week");
	displayemp(weeklyemployee);
	System.out.println("For hourly employee salary per hour");
	displayemp(hourlyemployee);
}
private static void displayemp(Employee employee){
	System.out.println("Amount: "+employee.getAmount());
}
}
