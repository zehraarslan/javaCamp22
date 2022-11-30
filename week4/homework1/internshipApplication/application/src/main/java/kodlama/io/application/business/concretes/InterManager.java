package kodlama.io.application.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.application.business.abstracts.InternService;
import kodlama.io.application.dataAccess.abstracts.InternRepository;
import kodlama.io.application.entities.concretes.Intern;
import kodlama.io.application.entities.concretes.ProjectLanguage;

@Service
public class InterManager implements InternService{
	
	private InternRepository internRepository;
	private List<Intern> interns;
	private List<ProjectLanguage> projectLanguages;
	
	@Autowired
	public InterManager(InternRepository internRepository, List<Intern> interns,
			List<ProjectLanguage> projectLanguages) {
		this.internRepository = internRepository;
		this.interns = interns;
		this.projectLanguages = projectLanguages;
	}


	@Override
	public void add(Intern intern) throws Exception {
		boolean control;
		
		if(intern.getFirstName().isEmpty() || intern.getLastName().isEmpty() || intern.getProjectName().isEmpty()) {
			throw new Exception("Bilgiler eksil girildi.");
		}
		control = languageControl(intern.getLanguageId());
		if(control) {
			internRepository.add(intern);
		}
		else {
			System.out.println("Programlama dili yanlış seçilmiş.");
		}
	}


	@Override
	public void delete(int id) {
		for (Intern _intern : interns) {
			if(_intern.getId() == id) {
				internRepository.delete(_intern);
			}
		}		
	}


	@Override
	public void updateIntern(Intern oldIntern, Intern intern) {
		for (Intern _intern : interns) {
			if(_intern.getId() == intern.getId()) {
				internRepository.updateIntern(oldIntern, intern);
			}
		}
	}


	@Override
	public List<Intern> getAll() {
		return internRepository.getAllIntern();
	}


	@Override
	public Intern getId(int id) {
		return internRepository.getIdIntern(id);
	}
	
	public boolean languageControl(int id) {
		for (ProjectLanguage language : projectLanguages) {
			if(language.getLanguageId() == id) {
				return true;
			}
		}
		return false;
	}
}
