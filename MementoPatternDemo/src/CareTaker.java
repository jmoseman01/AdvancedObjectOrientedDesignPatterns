import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	List<Memento> states=new ArrayList<Memento>();

	public void add(Memento saveStateToMemento) {
		states.add(saveStateToMemento);
	}

	public Memento get(int i) {
		return states.get(i);
	}


}
