package com.ood.audioplayer;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("mp3"))
		{
			System.out.println("Playing mp3 file.  Name:  "+fileName);
		}
		else if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4"))
		{
			mediaAdapter = new MediaAdapter(audioType);
			try {
				mediaAdapter.play(audioType, fileName);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else 
		{
			System.out.println("Invalid media.  "+ audioType + " format not supported");
		}

	}
}
