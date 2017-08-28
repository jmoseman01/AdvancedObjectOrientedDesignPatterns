public abstract class Shape {
	public DrawAPI drawAPI;
	
	protected Shape(DrawAPI drawApi) 
	{
		this.drawAPI=drawApi;
	}
	public abstract void draw();
}
