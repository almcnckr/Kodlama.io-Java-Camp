package kodlamaioweb;

import kodlamaioweb.business.CategoryManager;
import kodlamaioweb.business.CourseManager;
import kodlamaioweb.business.InstructorManager;
import kodlamaioweb.core.logging.DatabaseLogger;
import kodlamaioweb.core.logging.FileLogger;
import kodlamaioweb.dataaccess.HibernateInstructorDao;
import kodlamaioweb.dataaccess.JdbcCategoryDao;
import kodlamaioweb.dataaccess.JdbcCourseDao;
import kodlamaioweb.entities.Category;
import kodlamaioweb.entities.Course;
import kodlamaioweb.entities.Instructor;

public class Main {

	public static void main(String[] args) {
		/*
		 * Kurs ismi tekrar edemezi denemek için kurs ismini Python Kursu yapmalısınız
		 * Kategori ismi tekrar edemez için ise kategori ismini Veri Bilimi yapmalısınız
		 * Normalde bu değerler veritabanından geliyor fakat veritabanı bağlantımız olmadığı için elle kendim ekledim
		 */
		Category category = new Category(1, "Programlama");
		Course course = new Course(1, 1, "(2022 Yazılım Geliştirici Yetiştirme Kampı - JAVA)", 0);
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), new FileLogger());
		categoryManager.add(category);
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), new DatabaseLogger());
		courseManager.add(course);
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), new FileLogger());
		instructorManager.add(instructor);

	}

}
