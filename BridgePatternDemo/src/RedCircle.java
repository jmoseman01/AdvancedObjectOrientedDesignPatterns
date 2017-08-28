public class RedCircle implements DrawAPI {
	/**
	 * Implement the draw circle red circle method
	 */
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
   }
}