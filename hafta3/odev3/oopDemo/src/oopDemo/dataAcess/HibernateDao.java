package oopDemo.dataAcess;

import oopDemo.entities.Category;
import oopDemo.entities.Course;
import oopDemo.entities.Student;

public class HibernateDao implements StudentDao, CategoryDao, CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Data added with Hibernate : " + course.getCourseName());
	}

	@Override
	public void delete(Course course) {
		System.out.println("Data deleted from Hibernate : " + course.getCourseName());
	}

	@Override
	public void add(Category category) {
		System.out.println("Data added with Hibernate : " + category.getCategoryName());
	}

	@Override
	public void delete(Category category) {
		System.out.println("Data deleted from Hibernate : " + category.getCategoryName());
	}

	@Override
	public void add(Student student) {
		System.out.println("Data added with Hibernate : " + student.getFirstName() + " " + student.getLastName());
	}

	@Override
	public void delete(Student student) {
		System.out.println("Data deleted from Hibernate : " + student.getFirstName() + " " + student.getLastName());
	}
	
}
