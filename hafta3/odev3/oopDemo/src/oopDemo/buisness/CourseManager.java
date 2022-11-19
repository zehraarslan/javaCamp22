package oopDemo.buisness;

import java.util.List;

import oopDemo.core.logging.Logger;
import oopDemo.dataAcess.CourseDao;
import oopDemo.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private List<Course> courses;
	private List<Logger> loggers;
	
	public CourseManager(CourseDao courseDao, List<Course> courses, List<Logger> loggers) {
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		
		try {
			if (course.getPrice() <= 0) {
				throw new Exception("Course price is wrong");
			}
			if (course.getCourseName().isEmpty()) {
				throw new Exception("Course name is invalid.");
			}
			for (Course _course : courses) {
				if (_course.getCourseName().equals(course.getCourseName())) {
					throw new Exception("There is a course name");
				}
			}
			courses.add(course);
			courseDao.add(course);
			
			for (Logger logger : loggers) {
				logger.log(course.getCourseName());
			}
			System.out.println("Successful course saved : " + course.getCourseName());
		} catch (Exception e) {
			System.out.println("An unexpected error has occurred : " + e);
		}
	}
}
