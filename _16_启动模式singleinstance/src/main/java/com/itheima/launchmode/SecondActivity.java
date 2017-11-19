package com.itheima.launchmode;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	}

	public void open01(View view) {
		Intent intent = new Intent(this, FirstActivity.class);
		startActivity(intent);
	}

	public void open02(View view) {
		Intent intent = new Intent(this, SecondActivity.class);
		startActivity(intent);
	}
}
