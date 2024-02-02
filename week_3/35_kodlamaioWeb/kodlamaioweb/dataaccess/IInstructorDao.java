package kodlamaioweb.dataaccess;

import java.util.List;

import kodlamaioweb.entities.Instructor;

public interface IInstructorDao {

	void add(Instructor instructor);

	void update(int id);

	void delete(int id);

	List<Instructor> getInstructors();

	Instructor getInstructorById(int id);
}
