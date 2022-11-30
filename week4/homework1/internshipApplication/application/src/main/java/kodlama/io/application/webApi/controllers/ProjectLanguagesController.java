package kodlama.io.application.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.application.business.abstracts.ProjectLanguageService;
import kodlama.io.application.entities.concretes.ProjectLanguage;

@RestController
@RequestMapping("api/projectLanguages")
public class ProjectLanguagesController {
	private ProjectLanguageService projectLanguageService;
	
	@Autowired
	public ProjectLanguagesController(ProjectLanguageService projectLanguageService) {
		this.projectLanguageService = projectLanguageService;
	}
	
	@PostMapping("/add")
	public void add(ProjectLanguage projectLanguage) throws Exception {
		projectLanguageService.add(projectLanguage);
	}
	
	@DeleteMapping("/delete")
	public void delete(int id) {
		projectLanguageService.delete(id);
	}
	
	@PutMapping("/update")
	public void updateLanguage(ProjectLanguage oldProjectLanguage, ProjectLanguage projectLanguage) {
		projectLanguageService.updateLanguage(oldProjectLanguage, projectLanguage);
	}
	
	@GetMapping("/getAll")
	public List<ProjectLanguage> getAll() {
		return projectLanguageService.getAll();
	}
	
	@GetMapping("/getId/{id}")
	public ProjectLanguage getId(int id) {
		return projectLanguageService.getId(id);
	}
}
