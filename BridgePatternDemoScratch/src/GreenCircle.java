public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		String greenStr=String.format("green %d %d %d", radius,x,y);
		System.out.println(greenStr);
		
	}

}
