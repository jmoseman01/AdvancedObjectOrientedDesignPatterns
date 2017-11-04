import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {


	//working as db
	List<Student> students;
	
	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student student1 = new Student("Robert",0);
		Student student2 = new Student("John",1);
		students.add(student1);
		students.add(student2);

	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student:\tRoll No\t"+student.getRollNo()+"update in the database");
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
	}

	@Override
	public void addStudent(Student student) {
		students.add(student);
	}

	@Override
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}

}
