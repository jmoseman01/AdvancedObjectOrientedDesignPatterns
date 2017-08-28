public class GreenCircle implements DrawAPI {
	/**
	 * implement the green draw circle method
	 */
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
   }
}