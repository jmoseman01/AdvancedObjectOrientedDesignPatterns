
public class Cricket extends Game {
	public String gameName="cricket";

	@Override
	public void initialize() {
		System.out.println(gameName+" Game Initialized! Start Playing");
	}

	@Override
	public void startPlay() {
		System.out.println(gameName+" Game Started! Enjoy the game");

	}

	@Override
	public void endPlay() {
		System.out.println(gameName+" Game Finished!");
	}

}
