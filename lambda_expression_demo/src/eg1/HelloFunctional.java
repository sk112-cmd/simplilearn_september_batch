package eg1;

@FunctionalInterface
public interface HelloFunctional {

	void hello();
}


@FunctionalInterface
interface Addition{
	int sum(int a,int b,int c);
}