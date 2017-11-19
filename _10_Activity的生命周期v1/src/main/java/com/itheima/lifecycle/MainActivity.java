package com.itheima.lifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	//当Activity被创建的时候调用的方法
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		System.out.println("oncreate");
	}

	//当Activity被销毁的时候调用的方法
	@Override
	protected void onDestroy() {
		super.onDestroy();
		System.out.println("onDestroy");
	}
	//Activity界面用户可见的时候调用的方法
	@Override
	protected void onStart() {
		System.out.println("onstart");
		super.onStart();
	}
	//Activity界面用户不再可见的时候调用的方法.
	@Override
	protected void onStop() {
		System.out.println("onstop");
		super.onStop();
	}
	//获取焦点
	@Override
	protected void onResume() {
		System.out.println("onresume");
		super.onResume();
	}
	//失去焦点,暂停
	@Override
	protected void onPause() {
		System.out.println("onpause");
		super.onPause();
	}
	
	@Override
	protected void onRestart() {
		System.out.println("onrestart");
		super.onRestart();
	}

}
