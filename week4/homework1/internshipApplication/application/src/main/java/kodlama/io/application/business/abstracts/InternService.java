package kodlama.io.application.business.abstracts;

import java.util.List;

import kodlama.io.application.entities.concretes.Intern;

public interface InternService {
	void add(Intern intern) throws Exception;
	void delete(int id);
	void updateIntern(Intern oldIntern, Intern intern);
	List<Intern> getAll();
	Intern getId(int id);
}
