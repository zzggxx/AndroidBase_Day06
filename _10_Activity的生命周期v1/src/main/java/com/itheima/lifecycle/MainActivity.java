package com.itheima.lifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	//��Activity��������ʱ����õķ���
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		System.out.println("oncreate");
	}

	//��Activity�����ٵ�ʱ����õķ���
	@Override
	protected void onDestroy() {
		super.onDestroy();
		System.out.println("onDestroy");
	}
	//Activity�����û��ɼ���ʱ����õķ���
	@Override
	protected void onStart() {
		System.out.println("onstart");
		super.onStart();
	}
	//Activity�����û����ٿɼ���ʱ����õķ���.
	@Override
	protected void onStop() {
		System.out.println("onstop");
		super.onStop();
	}
	//��ȡ����
	@Override
	protected void onResume() {
		System.out.println("onresume");
		super.onResume();
	}
	//ʧȥ����,��ͣ
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
