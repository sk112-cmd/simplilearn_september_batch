package eg1;

public class Main {

	public static void main(String[] args) {
	
		EMS simpliEMS=new SimplilearnEmployer();
		System.out.println("Accessing Simplileran Employee using ems");
		simpliEMS.commonEmployeeBenifits();
		simpliEMS.createEmployee();
		simpliEMS.removeEmployee();
		simpliEMS.updateEmployee();
		
		
		EMS abcEMS=new AbcEmployer();
		System.out.println("\nAccessing Abc Employee using ems");
		abcEMS.commonEmployeeBenifits();
		abcEMS.createEmployee();
		abcEMS.removeEmployee();
		abcEMS.updateEmployee();
	}

}
