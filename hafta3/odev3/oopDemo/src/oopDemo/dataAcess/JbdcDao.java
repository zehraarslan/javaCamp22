package oopDemo.dataAcess;

import oopDemo.entities.Category;
import oopDemo.entities.Course;
import oopDemo.entities.Student;

public class JbdcDao implements StudentDao, CategoryDao, CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Data added with Jdbc : " + course.getCourseName());
	}

	@Override
	public void delete(Course course) {
		System.out.println("Data deleted from Jdbc : " + course.getCourseName());
	}

	@Override
	public void add(Category category) {
		System.out.println("Data added with Jdbc : " + category.getCategoryName());
	}

	@Override
	public void delete(Category category) {
		System.out.println("Data deleted from Jdbc : " + category.getCategoryName());
	}

	@Override
	public void add(Student student) {
		System.out.println("Data added with Jdbc : " + student.getFirstName() + " " + student.getLastName());
	}

	@Override
	public void delete(Student student) {
		System.out.println("Data deleted from Jdbc : " + student.getFirstName() + " " + student.getLastName());
	}

}
