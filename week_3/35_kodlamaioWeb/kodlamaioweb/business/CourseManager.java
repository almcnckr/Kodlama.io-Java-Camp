package kodlamaioweb.business;

import java.util.List;

import kodlamaioweb.business.utilities.CourseValidator;
import kodlamaioweb.core.logging.ILogger;
import kodlamaioweb.dataaccess.ICourseDao;
import kodlamaioweb.entities.Course;

public class CourseManager implements ICourseService {
	private ICourseDao courseDao;
	private ILogger logger;

	public CourseManager(ICourseDao courseDao, ILogger logger) {
		this.courseDao = courseDao;
		this.logger = logger;
	}

	@Override
	public void add(Course course) {
		if (CourseValidator.isValid(course, courseDao)) {
			courseDao.add(course);
			logger.log("Kurs eklendi. " + course.getId());
		}
	}

	@Override
	public void update(int id) {
		courseDao.update(id);
		logger.log("Kurs güncellendi. " + id);
	}

	@Override
	public void delete(int id) {
		courseDao.delete(id);
		logger.log("Kurs silindi. " + id);
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.getCourses();
	}

	@Override
	public Course getCourseById(int id) {
		return courseDao.getCourseById(id);
	}
}
