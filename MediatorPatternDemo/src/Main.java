
public class Main {

	public static void main(String[] args) {
		User john = new User("John");
		User joe = new User("Joe");
		john.sendMessage("hello world "+john.getName());
		joe.sendMessage("hello world "+joe.getName());

	}

}
