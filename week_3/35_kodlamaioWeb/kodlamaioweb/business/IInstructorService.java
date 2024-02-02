package kodlamaioweb.business;

import java.util.List;

import kodlamaioweb.entities.Instructor;

public interface IInstructorService {

	void add(Instructor instructor);

	void update(int id);

	void delete(int id);

	List<Instructor> getInstructors();

	Instructor getInstructorById(int id);
}
