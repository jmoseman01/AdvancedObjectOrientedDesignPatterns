package com.ood.mediaplayer.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3","foo.mp3");
		audioPlayer.play("vlc","foo.vlc");
		audioPlayer.play("mp4","foo.mp4");
		audioPlayer.play("avi","foo.avi");

	}

}
