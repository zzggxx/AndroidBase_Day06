package com.itheima.copyright;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

//    <intent-filter>
//    <action android:name="android.intent.action.VIEW" />
//    <category android:name="android.intent.category.DEFAULT" />
//    <category android:name="android.intent.category.BROWSABLE" />
//    <data android:scheme="http" />
//    <data android:scheme="https" />
//    <data android:scheme="about" />
//    <data android:scheme="javascript" />
//</intent-filter>
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.tv_link).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//激活系统的另外一个应用程序.
				Intent intent = new Intent();
				intent.setAction("android.intent.action.VIEW");
				intent.addCategory("android.intent.category.DEFAULT");
				intent.addCategory("android.intent.category.BROWSABLE");
				intent.setData(Uri.parse("http://www.itheima.com"));
				startActivity(intent);
			}
		});
	}


}
