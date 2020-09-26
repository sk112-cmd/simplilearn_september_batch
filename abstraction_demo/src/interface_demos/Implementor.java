package interface_demos;

public class Implementor implements MyInterface1,MyInterface2  {

	@Override
	public void myMethod1() {
		// TODO Auto-generated method stub
		System.out.println("myMethod1 of Myinterface1 x = "+(MyInterface1.x));
		
	}

	@Override
	public void myMethod2() {
		// TODO Auto-generated method stub
		System.out.println("myMethod2 of Myinterface1 x = "+(MyInterface1.x));
	}

	@Override
	public void myMethod3() {
		// TODO Auto-generated method stub
		System.out.println("myMethod3 of Myinterface1 x = "+(MyInterface1.x));
	}

	@Override
	public void common() {
		// TODO Auto-generated method stub
		System.out.println("common method for both Myinterface1,MyInterface2"); 	
	}

	@Override
	public void myMethod5() {
		// TODO Auto-generated method stub
		System.out.println("myMethod5 of Myinterface2 x = "+MyInterface2.x);
	}

	@Override
	public void myMethod6() {
		// TODO Auto-generated method stub
		System.out.println("myMethod6 of Myinterface2 x = "+MyInterface2.x); 
	}

}
