package com.ood.advancedmediaplayer;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String filename) throws Exception {
		String string = "Vlc shouldn't be played through mp4 player";
		throw new Exception(string);
	}

	@Override
	public void playMp4(String filename) {
		System.out.println("playing mp4:\t"+ filename);
	}


}
