package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	void add(ProgrammingLanguage programmingLanguage);

	void delete(int id);

	void update(int id, String name);

	List<ProgrammingLanguage> getAll();
	
	ProgrammingLanguage getById(int id);
}
