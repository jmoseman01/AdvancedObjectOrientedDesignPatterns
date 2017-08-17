
public class Main {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		String[] shapeIds= {"1","2","3"};
		Shape clonedShape;
		for(String shapeId: shapeIds) 
		{
			clonedShape = (Shape)ShapeCache.getShape(shapeId);
			System.out.println("Type:\t"+clonedShape.getType());
		}

	}

}
