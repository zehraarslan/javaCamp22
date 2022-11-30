package kodlama.io.application.dataAccess.abstracts;

import java.util.List;

import kodlama.io.application.entities.concretes.Intern;

public interface InternRepository {
	void add(Intern intern);
	void delete(Intern intern);
	void updateIntern(Intern oldIntern, Intern intern);
	List<Intern> getAllIntern();
	public Intern getIdIntern(int id);
}
