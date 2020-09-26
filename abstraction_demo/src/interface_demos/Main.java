package interface_demos;

public class Main {

	public static void main(String[] args) {
		
		
		MyInterface1 m1=new Implementor();
		System.out.println("Accessing MyInterface1 methods");
		m1.common();
		m1.myMethod1();
		m1.myMethod2();
		m1.myMethod3();
		m1.helloDefaultFromJava8();
		
		
		MyInterface2 m2=new Implementor();
		System.out.println("\nAccessing MyInterface2 methods");
		m2.common();
		m2.myMethod5();
		m2.myMethod6();
		MyInterface2.helloStaticFromJava8();
	
		
	}

}
