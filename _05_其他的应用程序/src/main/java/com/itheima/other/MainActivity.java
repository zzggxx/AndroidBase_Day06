package com.itheima.other;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	// 显式意图
	public void click01(View view) {
		Intent intent = new Intent();
		intent.setClassName("com.itheima.twointent",
				"com.itheima.twointent.Activity01");
		startActivity(intent);
	}

	// 隐式意图
	public void click02(View view) {
		Intent intent = new Intent();
		intent.setAction("com.itheima.twointent.OPEN02");
		intent.addCategory("android.intent.category.DEFAULT");
		startActivity(intent);
	}

}
