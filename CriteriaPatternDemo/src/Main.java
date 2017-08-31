import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));

		//construct all criteria
		//male
		Criteria maleCriteria = new CriteriaMale();
		//female
		Criteria femaleCriteria = new CriteriaFemale();
		//single
		Criteria singleCriteria = new CriteriaSingle();
		//single male
		Criteria singleMaleCriteria = new AndCriteria(singleCriteria,maleCriteria);
		//single or female
		Criteria singleOrFemaleCriteria = new OrCriteria(singleCriteria,femaleCriteria);


		//use print person to print male
		System.out.println("Males: ");
		printPersons(maleCriteria.meetCriteria(persons));

		//use print person to print female
		System.out.println("\nFemales: ");
		printPersons(femaleCriteria.meetCriteria(persons));

		//use print person to print single males
		System.out.println("\nSingle Males: ");
		printPersons(singleMaleCriteria.meetCriteria(persons));

		//single or female
		System.out.println("\nSingle Or Females: ");
		printPersons(singleOrFemaleCriteria.meetCriteria(persons));
	}

	public static void printPersons(List<Person> persons) {

		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender()
					+ ", Marital Status : " + person.getMaritalStatus() + " ]");
		}
	}
}
