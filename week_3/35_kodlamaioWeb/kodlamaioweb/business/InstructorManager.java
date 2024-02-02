package kodlamaioweb.business;

import java.util.List;

import kodlamaioweb.core.logging.ILogger;
import kodlamaioweb.dataaccess.IInstructorDao;
import kodlamaioweb.entities.Instructor;

public class InstructorManager implements IInstructorService {
	private IInstructorDao instructorDao;
	private ILogger logger;

	public InstructorManager(IInstructorDao instructorDao, ILogger logger) {
		this.instructorDao = instructorDao;
		this.logger = logger;
	}

	@Override
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		logger.log("Eğitimci eklendi. " + instructor.getId());
	}

	@Override
	public void update(int id) {
		instructorDao.update(id);
		logger.log("Eğitimci güncellendi. " + id);
	}

	@Override
	public void delete(int id) {
		instructorDao.delete(id);
		logger.log("Eğitimci silindi. " + id);
	}

	@Override
	public List<Instructor> getInstructors() {
		return instructorDao.getInstructors();
	}

	@Override
	public Instructor getInstructorById(int id) {
		return instructorDao.getInstructorById(id);
	}

}
