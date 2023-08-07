package day2;

public class Prog9 {
String name;
String color;
String model;
double cc;
public static void main(String[] args) {
	Prog9 p1=new Prog9("maruti800","white","2344",453463);
	p1.car_details();
	
}
Prog9(String name,String color,String model,double cc){
	this.name=name;
	this.color=color;
	this.model=model;
	this.cc=cc;
		
}
public void car_details() {
	System.out.println(name+" "+color+" "+model+" "+cc);
	
}
}
