package com.itheima.smsshare;

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

	// <intent-filter>
	// <action android:name="android.intent.action.VIEW" />
	// <action android:name="android.intent.action.SENDTO" />
	// <category android:name="android.intent.category.DEFAULT" />
	// <category android:name="android.intent.category.BROWSABLE" />
	// <data android:scheme="sms" />
	// <data android:scheme="smsto" />
	// </intent-filter>
	public void click(View view) {
		for (int i = 0; i < 100; i++) {
			Intent intent = new Intent();
			intent.setAction("android.intent.action.SENDTO");
			intent.addCategory("android.intent.category.DEFAULT");
			intent.addCategory("android.intent.category.BROWSABLE");
			intent.setData(Uri.parse("smsto:"));
			intent.putExtra("sms_body",
					"�Ƽ���ʹ��һ�����,���ֽ���Ʒ������,�Ҳ��Գ����Ľ����׼ȷѽ,���ص�ַ,http://bbs.itheima.com");
			startActivity(intent);
		}
	}
}
