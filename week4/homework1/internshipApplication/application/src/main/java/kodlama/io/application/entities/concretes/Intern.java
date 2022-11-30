package kodlama.io.application.entities.concretes;

public class Intern {
	private int id;
	private String firstName;
	private String lastName;
	private String projectName;
	private int languageId;
	
	
	public Intern() {
		
	}


	public Intern(int id, String firstName, String lastName, String projectName, int languageId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.projectName = projectName;
		this.languageId = languageId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public int getLanguageId() {
		return languageId;
	}


	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	
	
	
}
