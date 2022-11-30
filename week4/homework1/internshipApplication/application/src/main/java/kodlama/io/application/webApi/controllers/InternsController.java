package kodlama.io.application.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.application.business.abstracts.InternService;
import kodlama.io.application.entities.concretes.Intern;

@RestController
@RequestMapping("/api/Intern")
public class InternsController {
	private InternService internService;
	
	@Autowired
	public InternsController(InternService internService) {
		this.internService = internService;
	}
	
	@PostMapping("/add")
	public void add(Intern intern) throws Exception {
		internService.add(intern);
	}
	
	@DeleteMapping("/delete")
	public void delete(int id) {
		internService.delete(id);
	}
	
	@PutMapping("/update")
	public void updateIntern(Intern oldIntern, Intern intern) {
		internService.updateIntern(oldIntern, intern);
	}

	@GetMapping("/getAll")
	public List<Intern> getAll() {
		return internService.getAll();
	}
	
	@GetMapping("/getId/{id}")
	public Intern getId(int id) {
		return internService.getId(id);
	}
}
