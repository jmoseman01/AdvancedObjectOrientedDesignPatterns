
public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		String redStr = String.format("red %d %d %d", radius,x,y);
		System.out.println(redStr);
	}

}
