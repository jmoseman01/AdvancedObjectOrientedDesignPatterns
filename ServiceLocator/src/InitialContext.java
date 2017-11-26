
public class InitialContext {
	public Object lookup(String jndiName) 
	{
		if(jndiName.equalsIgnoreCase("SERVICE1"))
		{
			System.out.println("Looking up and creating a new service1 object");
			return new Service1();
		}
		else if(jndiName.equalsIgnoreCase("SERVICE2"))
		{
			System.out.println("Looking up and creating a new service2 object");
			return new Service2();
		}
		return null;
	}

}
