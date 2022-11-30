 package kodlama.io.application.dataAccess.abstracts;

import java.util.List;

import kodlama.io.application.entities.concretes.ProjectLanguage;

public interface ProjectLanguageRepository {
	void add(ProjectLanguage projectLanguage);
	void delete(ProjectLanguage projectLanguage);
	void updateLanguage(ProjectLanguage oldProjectLanguage, ProjectLanguage projectLanguage);
	List<ProjectLanguage> getAll();
	ProjectLanguage getId(int id);
}
