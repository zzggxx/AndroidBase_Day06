package com.itheima.twointent;

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

	//��ʽ��ͼ
	public void start01(View view) {
		//Intent intent = new Intent(this,Activity01.class);
		
		Intent intent = new Intent();
		intent.setClassName("com.itheima.twointent", "com.itheima.twointent.Activity01");
		
		startActivity(intent);
	}
	
	//��ʽ��ͼ
	public void start02(View view) {
		Intent intent = new Intent();
		intent.setAction("com.itheima.twointent.OPEN02");
		intent.addCategory("android.intent.category.DEFAULT");		//���Բ��������õ�,Ĭ�ϵľ����ֻ�
		startActivity(intent);
	}
}
