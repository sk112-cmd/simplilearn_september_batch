package ex2;

public class Main {

	public static void main(String[] args) {
		Person p1=new Person(100, "Divya");
		System.out.println("Printing person");
		System.out.println(p1);
		
		Employee e1=new Employee(900, "Ravi", "Manager", 1212112.22);
		System.out.println("\nPrinting employee");
		System.out.println(e1);
		
		Project pro1=new Project(7000, "XYZ Pro", "Simplilearn");
		e1.setProject(pro1);
		
		
		System.out.println("\nPrinting employee after updating project details");
		System.out.println(e1);
		
		

	}

}
