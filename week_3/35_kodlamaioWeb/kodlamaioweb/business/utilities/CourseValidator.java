package kodlamaioweb.business.utilities;

import java.util.List;

import kodlamaioweb.dataaccess.ICourseDao;
import kodlamaioweb.entities.Course;

public class CourseValidator {

	public static boolean isValid(Course course, ICourseDao courseDao) {
		if (course.getPrice() < 0) {
			System.out.println("Kurs fiyatı 0'dan küçük olamaz.");
			return false;
		}

		List<Course> courses = courseDao.getCourses();

		for (Course course_ : courses) {
			if (course_.getName().equals(course.getName())) {
				System.out.println("Kurs isimleri tekrar edemez.");
				return false;
			}
		}
		
		return true;
	}

}
