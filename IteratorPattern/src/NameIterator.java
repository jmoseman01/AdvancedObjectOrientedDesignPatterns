
public class NameIterator implements Iterator {
	
	private String[] names;
	int index=0;
	
	

	public NameIterator(String[] names) {
		this.names = names;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index<getNames().length)
		{
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		if(this.hasNext())
		{
			return names[index++];
		}
		return null;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}
}
