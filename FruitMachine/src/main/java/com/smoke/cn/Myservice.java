package com.smoke.cn;

import java.io.IOException;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class Myservice extends Service {
	MediaPlayer mediaPlayer;
	@Override
	public IBinder onBind(Intent arg0) {
		return null;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	public void onStart(Intent intent, int startId) {
		if(mediaPlayer==null)
			mediaPlayer=MediaPlayer.create(this, R.raw.mu);
		if(mediaPlayer.isPlaying()){
			mediaPlayer.reset();
		}
		mediaPlayer.start();
		super.onStart(intent, startId);
	}
	
}
