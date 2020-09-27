package eg1;

public class OldStyleLambdaLessDemo  implements HelloFunctional{

	public static void main(String[] args) {
	
		HelloFunctional h=new OldStyleLambdaLessDemo();
		h.hello();
		
		HelloFunctional h1=new HelloFunctional() {
			
			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("Old style anonymous");
			}
		};
		h1.hello();
	}

	@Override
	public void hello() {
		System.out.println("Hello old style");
		
	}

}

//sort(Player) - id,name,city,age,experience,gender