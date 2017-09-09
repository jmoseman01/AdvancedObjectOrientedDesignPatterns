import com.shape.Shape;
import com.shape.Circle;
import com.shape.Rectangle;

public class DecoratorPatternDemo {
	
	public static void main(String args[]) 
	{
		Shape circle = new Circle();
		
		//implement red shape decorator on circle and rectangle
		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		circle.draw();
		redCircle.draw();
		redRectangle.draw();
	}

}
