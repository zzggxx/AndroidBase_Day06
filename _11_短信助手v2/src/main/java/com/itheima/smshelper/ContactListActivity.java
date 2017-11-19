package com.itheima.smshelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class ContactListActivity extends Activity {
	private ListView lv_contact;
	private String[] objects = {
			"13512340000",
			"13512340001",
			"13512340002",
			"13512340003",
			"13512340004", 
			"13512340005",
			"13512340006",
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contactlist);
		lv_contact = (ListView) findViewById(R.id.lv_contact);
		lv_contact.setAdapter(new ArrayAdapter<String>(this, R.layout.item, objects));
		
		lv_contact.setOnItemClickListener(new OnItemClickListener() {
			//当listview的条目被点击的时候调用的方法
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				System.out.println("position:"+position);
				String message = objects[position];
				//把当前界面的数据,返回给开启我的界面.
				Intent data = new Intent();
				data.putExtra("message", message);
				setResult(0, data);
				//把当前界面关闭
				finish();
			}
		});
		
	}
}
