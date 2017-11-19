package com.itheima.intentdemo;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;


public class DemoActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.demo);

        Toast.makeText(this,getIntent().getStringExtra("body"),Toast.LENGTH_SHORT).show();
	}
}
