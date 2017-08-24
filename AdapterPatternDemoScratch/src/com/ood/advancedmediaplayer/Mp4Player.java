package com.ood.advancedmediaplayer;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("vlc can't be played by mp4");
	}

	@Override
	public void playMp4(String fileName) throws Exception {
		System.out.println("playing mp4:\t"+fileName);
	}

}
