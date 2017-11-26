
public class ServiceLocator {
	private static Cache cache;
	
	static 
	{
		cache=new Cache();
	}
	
	public static Service getService(String jndiName) 
	{
		//if in the cache return the service
		Service service = cache.getService(jndiName);
		if(service!=null)
		{
			return service;
		}
		
		//if not in the cache to a jndi lookup and  
		//add it to the cache
		InitialContext context=new InitialContext();
		Service service1=(Service)context.lookup(jndiName);
		cache.addService(service1);
		return service1;
	}

}
