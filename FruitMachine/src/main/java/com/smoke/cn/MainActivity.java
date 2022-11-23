package com.smoke.cn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {
	Intent intent;
	Handler handler=new Handler();
	Runnable r=new Runnable() {
		public void run() {
			intent.setClass(MainActivity.this, fruitActivity.class);
	        startActivity(intent);
		}
	};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        intent=new Intent();
		handler.postDelayed(r, 100);
    }
}