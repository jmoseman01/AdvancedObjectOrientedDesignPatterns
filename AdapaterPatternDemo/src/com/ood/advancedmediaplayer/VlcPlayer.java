package com.ood.advancedmediaplayer;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String filename) {
		System.out.println("playing vlc:\t"+ filename);
	}

	@Override
	public void playMp4(String filename) throws Exception {
		throw new Exception("mp4's shouldn't be played in here");
	}

}
