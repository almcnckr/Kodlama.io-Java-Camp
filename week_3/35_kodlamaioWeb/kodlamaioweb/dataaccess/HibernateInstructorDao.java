package kodlamaioweb.dataaccess;

import java.util.List;

import kodlamaioweb.entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate : Eğitmen eklendi. " + instructor.getId());		
	}

	@Override
	public void update(int id) {
		System.out.println("Hibernate : Eğitmen güncellendi. " + id);
	}

	@Override
	public void delete(int id) {
		System.out.println("Hibernate : Eğitmen silindi. " + id);
	}

	@Override
	public List<Instructor> getInstructors() {
		System.out.println("Hibernate : Eğitmen listesi getirildi.");
		return null;
	}

	@Override
	public Instructor getInstructorById(int id) {
		System.out.println("Hibernate : Eğitmen getirildi. " + id);
		return null;
	}

}
