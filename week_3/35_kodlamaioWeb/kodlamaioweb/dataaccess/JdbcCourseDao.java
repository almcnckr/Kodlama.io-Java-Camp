package kodlamaioweb.dataaccess;

import java.util.ArrayList;
import java.util.List;

import kodlamaioweb.entities.Course;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("JDBC : Kurs eklendi. " + course.getId());
	}

	@Override
	public void update(int id) {
		System.out.println("JDBC : Kurs güncellendi. " + id);
	}

	@Override
	public void delete(int id) {
		System.out.println("JDBC : Kurs silindi. " + id);
	}

	@Override
	public List<Course> getCourses() {
		System.out.println("JDBC : Kurs listesi getirildi.");

		// normalde categories databaseden geliyor fakat database bağlantısı olmadığı için null o yüzden elle atama yaptım
		// validator için
		List<Course> courses = new ArrayList<Course>();
		courses.add(new Course(999, 999, "Python Kursu", 0));
		return courses;
	}

	@Override
	public Course getCourseById(int id) {
		System.out.println("JDBC : Kurs getirildi. " + id);
		return null;
	}

}
