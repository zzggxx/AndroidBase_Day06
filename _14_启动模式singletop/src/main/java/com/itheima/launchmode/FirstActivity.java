package com.itheima.launchmode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
	}

	public void open01(View view){
		Intent intent = new Intent(this,FirstActivity.class);
		startActivity(intent);
	}
	public void open02(View view){
		Intent intent = new Intent(this,SecondActivity.class);
		startActivity(intent);
	}
}
