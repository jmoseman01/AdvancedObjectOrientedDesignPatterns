import java.util.ArrayList;

public class StudentBO {

	private ArrayList<StudentVO> students;


	
	public StudentBO() {
		students = new ArrayList<StudentVO>();
		StudentVO student1 = new StudentVO("Robert",0);
		StudentVO student2 = new StudentVO("John",1);
		students.add(student1);
		students.add(student2);
	}

	public ArrayList<StudentVO> getAllStudents() {
		return students;
	}

	public void updateStudent(StudentVO student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	}

	public void deleteStudent(StudentVO student) {
		students.remove(student.getRollNo());
	}

	public void addStudent(StudentVO student) {
		students.add(student);
	}

	public StudentVO getStudent(int rollNo) {
		return students.get(rollNo);
	}

}
