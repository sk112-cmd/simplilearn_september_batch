package eg1;

public abstract  class EMS {

	public void commonEmployeeBenifits() {
		System.out.println("Common for any employee");
	}
	
	public abstract void createEmployee();
	public abstract void updateEmployee();
	public abstract void getEmployee();
	public abstract void removeEmployee();
}
