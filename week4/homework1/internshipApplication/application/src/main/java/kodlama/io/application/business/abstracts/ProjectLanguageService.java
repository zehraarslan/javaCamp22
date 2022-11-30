package kodlama.io.application.business.abstracts;

import java.util.List;

import kodlama.io.application.entities.concretes.ProjectLanguage;

public interface ProjectLanguageService {
	void add(ProjectLanguage projectLanguage) throws Exception;
	void delete(int id);
	void updateLanguage(ProjectLanguage oldProjectLanguage, ProjectLanguage projectLanguage);
	List<ProjectLanguage> getAll();
	ProjectLanguage getId(int id);
}
