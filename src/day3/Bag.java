package day3;

public class Bag {
String bag;
int capacity;
String color;
double cost;
public Bag(String bag, int capacity, String color, double cost) {
	super();
	this.bag = bag;
	this.capacity = capacity;
	this.color = color;
	this.cost = cost;
}

@Override
public String toString() {
	return bag+" "+capacity+" "+color+" "+cost;
}
public boolean equals(Object o) {
	Bag f=(Bag)o;
	return this.bag==f.bag;
}

@Override 
public int hashCode() {
	return 123342;
}
public static void main(String[] args) {
	Bag b=new Bag("skybag",22,"black",2500);
	Bag f=new Bag("kitex",21,"white",780);
	System.out.println(b.toString());
	System.out.println(b.hashCode());
	System.out.println(b.equals(f));
	
}

}
