package day3;

public class Excep1 {
public static void main(String[] args) {
	int[]i= {4,5,6,7,8};
	try {
		System.out.println(i[5]);
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("final block");
	}
}
}
