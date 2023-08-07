package day3;

public class Excep {
public static void main(String[] args) {
	int a=10;int b=0;
	try {
		System.out.println((a/b));
	}
	
	catch(NullPointerException e) {
		System.out.println("null point ");
	}
	catch(ArithmeticException e){
		System.out.println("cannot divided by zero");
	}
}
}
