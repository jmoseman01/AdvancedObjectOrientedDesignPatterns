package com.ood.advancedmediaplayer;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("playing vlc:\t"+fileName);

	}

	@Override
	public void playMp4(String fileName) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("mp4 can't be played by vlc");
	}

}
