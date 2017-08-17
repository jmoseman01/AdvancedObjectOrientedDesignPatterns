import java.util.Hashtable;

public class ShapeCache {
	   private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

	   //get shape from cache (shapeMap) and clone it
	   public static Shape getShape(String shapeId) {
	      Shape cachedShape = shapeMap.get(shapeId);
	      return (Shape) cachedShape.clone();
	   }

	   // for each shape run database query and create shape
	   // shapeMap.put(shapeKey, shape);
	   // for example, we are adding three shapes
	   
	   /**
	    * create circle/square/rectangle
	    * put in hash map
	    */
	   public static void loadCache() {
		   //load circle in cache
		   Circle circle = new Circle();
		   circle.setId("1");
		   shapeMap.put(circle.getId(), circle);
		   
		   //load square in cache
		   Square square= new Square();
		   square.setId("2");
		   shapeMap.put(square.getId(), square);

		   //load rectangle in cache
		   Rectangle rectangle = new Rectangle();
		   rectangle.setId("3");
		   shapeMap.put(rectangle.getId(), circle);
	   }
}
