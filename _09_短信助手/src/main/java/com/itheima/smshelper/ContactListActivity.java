package com.itheima.smshelper;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
	}
}
