
public class StartState implements State {

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Player is in the start state");
		context.setState(this);
		
	}

	public String toString() 
	{
		return "Start State";
	}

}
