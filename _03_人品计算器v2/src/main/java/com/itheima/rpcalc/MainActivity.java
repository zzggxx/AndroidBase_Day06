package com.itheima.rpcalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		new Thread(){
			public void run() {
				try {
					Thread.sleep(2000);							//可以不进行使用睡眠,只是无法进行展示效果
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, CalcActivity.class);    //应该是MainActivity.this,单写this时会报错的,子线程!
				startActivity(intent);
				finish();						//把mainActivity关闭,当前的界面进行关闭
			};
		}.start();
	
	}


}
