package eg1;

public class LambdaStyle {

	public static void main(String[] args) {
		
		HelloFunctional h=()->System.out.println("Hello LAmbda");
		h.hello();
		
		HelloFunctional h1=()->System.out.println("Hello LAmbda Again");
		h1.hello();
		
		
		Addition a=(x,y,z)->{
			return x+y+z;
		};
		System.out.println(a.sum(100, 44, 33));

	}

}
