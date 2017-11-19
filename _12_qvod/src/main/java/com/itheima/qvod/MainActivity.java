package com.itheima.qvod;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onStop() {
		System.out.println("onstop,暂停视频的播放");
		super.onStop();
	}
	
	@Override
	protected void onStart() {
		System.out.println("onstart, 继续播放视频");
		super.onStart();
	}

}
