package oopDemo.buisness;

import java.util.List;

import oopDemo.core.logging.Logger;
import oopDemo.dataAcess.StudentDao;
import oopDemo.entities.Student;

public class StudentManager {
	private StudentDao studentDao;
	private List<Logger> loggers;
	
	public StudentManager(StudentDao studentDao, List<Logger> loggers) {
		this.studentDao = studentDao;
		this.loggers = loggers;
	}
	
	public void add(Student student) throws Exception {
		try {
			if (student.getFirstName().isEmpty() || student.getLastName().isEmpty()) {
				throw new Exception("Name and surname cannot be left blank");
			}
			studentDao.add(student);
			
			for (Logger logger : loggers) {
				logger.log(student.getFirstName() + " " + student.getLastName());
			}
			System.out.println("Successful student saved : " + student.getFirstName() + " " + student.getLastName());
		} catch (Exception e) {
			System.out.println("An unexpected error has occurred : " + e);
		}
	}
	
}
