package com.ood.mediaplayer.main;

import com.ood.audioplayer.MediaAdapter;

public class AudioPlayer implements MediaPlayer {

	@Override
	public void play(String fileType, String fileName) {
		// TODO Auto-generated method stub
		if(fileType.equalsIgnoreCase("mp3"))
		{
			play(fileName);
		}
		else if(fileType.equalsIgnoreCase("vlc")||fileType.equalsIgnoreCase("mp4"))
		{
			MediaAdapter mediaAdapter = new MediaAdapter(fileType);
			try {
				mediaAdapter.play(fileType,fileName);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("This file type is not supported:\t"+fileType);
		}
		
	}

	private void play(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("mp3 Playing:\t"+fileName);
		
	}

}
