package ex2;

public class Project {

	private int pid;
	private String projectName;
	private String clientName;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String projectName, String clientName) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.clientName = clientName;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", projectName=" + projectName + ", clientName=" + clientName + "]";
	}
	
}
