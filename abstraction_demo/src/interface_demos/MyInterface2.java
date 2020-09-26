package interface_demos;

public interface MyInterface2 {

	void myMethod5();
	void myMethod6();
	void common();
	
	int x=100; 
	
//	default void helloDefaultFromJava8() {
//		System.out.println("Interfaces in Java8 can have default methods with defination .. This is from MyInterface2");
//	}
	
	public static void helloStaticFromJava8() {
		System.out.println("Static definations in interface is now possible from Java8");
	}
}
