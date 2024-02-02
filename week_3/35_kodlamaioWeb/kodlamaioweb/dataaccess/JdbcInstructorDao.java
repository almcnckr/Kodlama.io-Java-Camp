package kodlamaioweb.dataaccess;

import java.util.List;

import kodlamaioweb.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC : Eğitmen eklendi. " + instructor.getId());		
	}

	@Override
	public void update(int id) {
		System.out.println("JDBC : Eğitmen güncellendi. " + id);
	}

	@Override
	public void delete(int id) {
		System.out.println("JDBC : Eğitmen silindi. " + id);
	}

	@Override
	public List<Instructor> getInstructors() {
		System.out.println("JDBC : Eğitmen listesi getirildi.");
		return null;
	}

	@Override
	public Instructor getInstructorById(int id) {
		System.out.println("JDBC : Eğitmen getirildi. " + id);
		return null;
	}

}
