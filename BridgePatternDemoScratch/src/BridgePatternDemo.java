public class BridgePatternDemo {
	public static void main(String args[]) 
	{
		Shape greenCircle = new Circle(100,100,5,new GreenCircle());
		Shape redCircle = new Circle(100,100,5,new RedCircle());
		
		greenCircle.draw();
		redCircle.draw();
	}

}
