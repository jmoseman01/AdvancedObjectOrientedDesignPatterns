
public class Main {
	//current state of students
	public static void main(String args[]) 
	{
		StudentDao studentDao = new StudentDaoImpl();
		
		for(Student student: studentDao.getAllStudents())
		{
			System.out.println(student.toString());
		}
		

		//update student
		Student student=studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);
		
		//getstudent
		Student studentAfterUpdate = studentDao.getStudent(0);
		System.out.println(studentAfterUpdate.toString());
	}
}
