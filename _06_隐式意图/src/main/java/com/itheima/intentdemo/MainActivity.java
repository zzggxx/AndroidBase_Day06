package com.itheima.intentdemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void click(View view){
		Intent intent = new Intent();
		//action ¶¯×÷
		//ÅÝ²è ÅÝæ¤
		intent.setAction("com.itheima.intentdemo.XXXX");
		intent.addCategory(Intent.CATEGORY_DEFAULT);
//		intent.setData(Uri.parse("itheima://afaf"));
//		intent.setType("text/plain");
		intent.setDataAndType(Uri.parse("itheima://afaf"), "text/plain");
		startActivity(intent);
	}

}
