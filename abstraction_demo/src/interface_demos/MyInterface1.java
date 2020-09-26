package interface_demos;

public interface MyInterface1 {

	void myMethod1();
	void myMethod2();
	void myMethod3(); //public & abstract by default
	
	int x=10; //static & final by default
	
	void common();
	
	default void helloDefaultFromJava8() {
		System.out.println("Interfaces in Java8 can have default methods with defination .. This is from MyInterface1");
	}
}
