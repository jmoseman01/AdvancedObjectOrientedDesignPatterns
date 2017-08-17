
public abstract class Shape implements Cloneable {
	private String id;
	protected String type;
	
	public abstract void draw();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public Object clone() {
		Object clonedShape = null;
		try {
			clonedShape = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clonedShape;

	}

}
