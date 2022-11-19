package oopDemo;

import java.util.ArrayList;
import java.util.List;

import oopDemo.buisness.CategoryManager;
import oopDemo.buisness.CourseManager;
import oopDemo.buisness.StudentManager;
import oopDemo.core.logging.DatabaseLogger;
import oopDemo.core.logging.EmailLogger;
import oopDemo.core.logging.FileLogger;
import oopDemo.core.logging.Logger;
import oopDemo.dataAcess.HibernateDao;
import oopDemo.dataAcess.JbdcDao;
import oopDemo.entities.Category;
import oopDemo.entities.Course;
import oopDemo.entities.Student;

public class Main {

	public static void main(String[] args) throws Exception {
		List<Category> categories = new ArrayList<>();
		List<Course> courses = new ArrayList<>();
		List<Logger> loggers = new ArrayList<>();
		
		//loggers.add(new FileLogger());
		loggers.add(new DatabaseLogger());
		//loggers.add(new EmailLogger());
		
		Category category1 = new Category(1, "Yazılım");
		Category category2 = new Category(2, "Matematik");
		Category category3 = new Category(3, "Sanat");
		CategoryManager categoryManager = new CategoryManager(new JbdcDao(), categories, loggers);
		categoryManager.add(category1);
		
		Course course1 = new Course(1, "Java", -10);
		Course course2 = new Course(2, "C#", 200);
		Course course3 = new Course(3, "Java", 100);
		CourseManager courseManager = new CourseManager(new HibernateDao(), courses, loggers);
		courseManager.add(course1);
		courseManager.add(course2);
		
		Student student1 = new Student(1, "Zehra", "ARSLAN");
		Student student2 = new Student(2, "Fırat", "SIR");
		StudentManager studentManager = new StudentManager(new JbdcDao(), loggers);
		studentManager.add(student1);
		studentManager.add(student2);
	}

}
