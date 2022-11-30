package kodlama.io.application.entities.concretes;

public class ProjectLanguage {
	private int languageId;
	private String languageName;
	
	
	public ProjectLanguage() {
		
	}


	public ProjectLanguage(int languageId, String languageName) {
		this.languageId = languageId;
		this.languageName = languageName;
	}


	public int getLanguageId() {
		return languageId;
	}


	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}


	public String getLanguageName() {
		return languageName;
	}


	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	
	
	
}
