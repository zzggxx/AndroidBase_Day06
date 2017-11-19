package com.itheima.smshelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText et_message;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et_message = (EditText) findViewById(R.id.et_message);
	}

	public void selectSmsContent(View view) {
		Intent intent = new Intent(this, SmsListActivity.class);
		// startActivity(intent);
		// �����µ�Activity���һ�ȡ����ֵ
		startActivityForResult(intent, 1);
	}

	// �����µĽ��� ѡ����ϵ��
	public void selectContact(View view) {
		Intent intent = new Intent(this, ContactListActivity.class);
		// startActivity(intent);
		// �����µ�Activity���һ�ȡ����ֵ
		startActivityForResult(intent, 2);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == 1) {
			System.out.println("���ǿ������µ�ѡ����ŵĽ��汻�ر���,������ݷ��ص�����");
			if (data != null) {
				String message = data.getStringExtra("message");
				et_message.setText(message);
			}
		}else if(requestCode == 2) {
			System.out.println("���ǿ������µ�ѡ����ϵ�˽��汻�ر���,������ݷ��ص�����");
		}
		super.onActivityResult(requestCode, resultCode, data);
	}

}
