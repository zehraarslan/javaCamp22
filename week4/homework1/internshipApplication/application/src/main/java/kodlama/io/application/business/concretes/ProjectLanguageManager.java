package kodlama.io.application.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.application.business.abstracts.ProjectLanguageService;
import kodlama.io.application.dataAccess.abstracts.ProjectLanguageRepository;
import kodlama.io.application.entities.concretes.ProjectLanguage;

@Service
public class ProjectLanguageManager implements ProjectLanguageService{
	
	private ProjectLanguageRepository projectLanguageRepository;
	private List<ProjectLanguage> projectLanguages;
	
	
	@Autowired
	public ProjectLanguageManager(ProjectLanguageRepository projectLanguageRepository,
			List<ProjectLanguage> projectLanguages) {
		this.projectLanguageRepository = projectLanguageRepository;
		this.projectLanguages = projectLanguages;
	}

	@Override
	public void add(ProjectLanguage projectLanguage) throws Exception {
		if (projectLanguage.getLanguageName().isEmpty()) {
			throw new Exception("Program dili boş bırakılmış.");
		}
		for (ProjectLanguage _projectLanguage : projectLanguages) {
			if(_projectLanguage.getLanguageName().equalsIgnoreCase(projectLanguage.getLanguageName())) {
				throw new Exception("Program dili zaten var.");
			}
		}
		projectLanguageRepository.add(projectLanguage);
	}

	@Override
	public void delete(int id) {
		for (ProjectLanguage _projectLanguage : projectLanguages) {
			if(_projectLanguage.getLanguageId() == id) {
				projectLanguageRepository.delete(_projectLanguage);
			}
		}
	}

	@Override
	public void updateLanguage(ProjectLanguage oldProjectLanguage, ProjectLanguage projectLanguage) {
		for (ProjectLanguage _projectLanguage : projectLanguages) {
			if(_projectLanguage.getLanguageId() == oldProjectLanguage.getLanguageId()) {
				projectLanguageRepository.updateLanguage(oldProjectLanguage, projectLanguage);
			}
		}
	}

	@Override
	public List<ProjectLanguage> getAll() {
		return projectLanguageRepository.getAll();
	}
	
	@Override
	public ProjectLanguage getId(int id) {
		return projectLanguageRepository.getId(id);
	}

}
