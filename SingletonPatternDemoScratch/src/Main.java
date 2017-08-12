
public class Main {
	public static void main(String args[]) 
	{
		//make sure standard constructor doesn't work
//		SingleObject singleton = new SingleObject();
		
		SingleObject singleton = SingleObject.getInstance();
		singleton.getMessage();
		
	}

}
