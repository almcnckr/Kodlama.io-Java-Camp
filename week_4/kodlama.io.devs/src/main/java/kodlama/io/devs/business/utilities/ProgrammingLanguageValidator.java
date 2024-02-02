package kodlama.io.devs.business.utilities;

import java.util.List;

import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.dataAccess.concretes.InMemoryProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

public class ProgrammingLanguageValidator {
	private List<ProgrammingLanguage> programmingLanguages;
	
	public ProgrammingLanguageValidator() {
		ProgrammingLanguageRepository programmingLanguageRepository = new InMemoryProgrammingLanguageRepository();
		programmingLanguages = programmingLanguageRepository.getAll();
	}

	public boolean isValid(ProgrammingLanguage programmingLanguage) {
		
		if (programmingLanguage.getName().isBlank()) {
			System.out.println("Programlama dili boş geçilemez.");
			return false;
		}
		
		for (ProgrammingLanguage programmingLanguage2 : programmingLanguages) {
			if (programmingLanguage2.getName().equalsIgnoreCase(programmingLanguage.getName())) {
				System.out.println("Bu programlama dili mevcut.");
				return false;
			}
			if (programmingLanguage.getId() == programmingLanguage2.getId()) {
				System.out.println("Bu id mevcut.");
				return false;
			}
		}
		return true;
	}

	public boolean isIdExist(int id) {
		for (ProgrammingLanguage programmingLanguage2 : programmingLanguages) {
			if (programmingLanguage2.getId() == id) {
				return true;				
			}
		}
		System.out.println("Bu id'de programlama dili mevcut değil.");
		return false;
	}
	
	public boolean isNameExist(String name) {
		for (ProgrammingLanguage programmingLanguage2 : programmingLanguages) {
			if (programmingLanguage2.getName().equalsIgnoreCase(name)) {
				return true;				
			}
		}
		return false;
	}
}
