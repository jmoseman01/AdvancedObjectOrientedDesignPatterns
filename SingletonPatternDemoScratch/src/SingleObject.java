
public class SingleObject {
	private static SingleObject singleton = new SingleObject();
	//this makes sure you can't construct the object
	private SingleObject() {}
	
	public static SingleObject getInstance() 
	{
		return singleton;
	}
	
	public void getMessage() 
	{
		System.out.println("Hello world!");
	}

}
