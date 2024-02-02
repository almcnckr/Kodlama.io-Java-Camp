package kodlamaioweb.business;

import java.util.List;

import kodlamaioweb.entities.Course;

public interface ICourseService {

	void add(Course course);

	void update(int id);

	void delete(int id);

	List<Course> getCourses();

	Course getCourseById(int id);
}
