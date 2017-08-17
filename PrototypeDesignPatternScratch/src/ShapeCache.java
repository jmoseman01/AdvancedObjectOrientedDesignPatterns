import java.util.HashMap;

public class ShapeCache {
	public static HashMap<String,Shape> shapeCache = new HashMap<String,Shape>();
	
	public static Shape getShape(String id) 
	{
		Shape shape = shapeCache.get(id);
		return (Shape) shape.clone();
	}

	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeCache.put(circle.getId(), circle);

		Square square = new Square();
		square.setId("2");
		shapeCache.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeCache.put(rectangle.getId(), rectangle);

	}

}
