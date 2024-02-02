package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.business.utilities.ProgrammingLanguageValidator;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLanguageRepository programmingLanguageRepository;
	private ProgrammingLanguageValidator programmingLanguageValidator;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
		programmingLanguageValidator = new ProgrammingLanguageValidator();
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		if (programmingLanguageValidator.isValid(programmingLanguage)) {
			programmingLanguageRepository.add(programmingLanguage);
			System.out.println("Ekleme işlemi başarılı.");
		} else {
			System.out.println("Ekleme işlemi başarısız.");
		}
	}

	@Override
	public void delete(int id) {
		if (programmingLanguageValidator.isIdExist(id)) {
			programmingLanguageRepository.delete(id);
			System.out.println("Silme işlemi başarılı.");
		} else {
			System.out.println("Silme işlemi başarısız.");
		}
	}

	@Override
	public void update(int id, String name) {
		if (programmingLanguageValidator.isIdExist(id)
				&& !programmingLanguageValidator.isNameExist(name)) {
			programmingLanguageRepository.update(id, name);
			System.out.println("Güncelleme işlemi başarılı.");
		} else {
			System.out.println("Güncelleme işlemi başarısız.");
		}
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		if (programmingLanguageValidator.isIdExist(id)) {
			return programmingLanguageRepository.getById(id);			
		}
		return null;
	}

}
