
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student model = retriveStudentFromDatabase();
		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		controller.setStudentName("John");
		controller.updateView();

	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}

}
